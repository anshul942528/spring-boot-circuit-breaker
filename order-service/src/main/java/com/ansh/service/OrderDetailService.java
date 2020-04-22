package com.ansh.service;

import com.ansh.model.Order;
import com.ansh.model.OrderDetail;
import com.ansh.model.OrderInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderDetailService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getOrderDetailFallback")
    public OrderInfo getOrderDetail(Order order) {
        Map<String, Object> map1 = new HashMap<>();
        map1.put("orderId", order.getOrderId());
        OrderDetail orderDetail = restTemplate.getForObject("http://order-details-service/info/{orderId}", OrderDetail.class, map1);
        return new OrderInfo(orderDetail.getPrice(), orderDetail.getZipCode(), orderDetail.getItemName(), order.getOrderId(), order.getStatus());
    }

    public OrderInfo getOrderDetailFallback(Order order) {
        return new OrderInfo(0, 111111, "Dummy", order.getOrderId(), order.getStatus());
    }
}
