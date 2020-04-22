package com.ansh.service;

import com.ansh.model.Order;
import com.ansh.model.UserOrders;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BasicService {

    public UserOrders getOrders(int userId) {
        UserOrders userOrders = new UserOrders();
        List<Order> orderList = Arrays.asList(
                new Order(1, "Delivered"),
                new Order(2, "Pending")
        );
        userOrders.setOrderList(orderList);
        return userOrders;
    }
}
