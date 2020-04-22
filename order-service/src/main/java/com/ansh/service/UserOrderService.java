package com.ansh.service;

import com.ansh.model.Order;
import com.ansh.model.UserOrders;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserOrderService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getUserOrdersFallback")
    public UserOrders getUserOrders(int userId) {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        return restTemplate.getForObject("http://user-order-service/order/{userId}", UserOrders.class, map);
    }

    public UserOrders getUserOrdersFallback(int userId){
        UserOrders userOrders = new UserOrders();
        userOrders.setOrderList(Arrays.asList(
                new Order(0, "Invalid")
        ));
        return userOrders;
    }
}
