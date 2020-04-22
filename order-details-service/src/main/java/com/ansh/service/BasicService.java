package com.ansh.service;

import com.ansh.model.OrderDetail;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BasicService {

    public OrderDetail getOrderInfo(int orderId) {
        OrderDetail orderDetail = new OrderDetail(15, 495224, "White Board");
        return orderDetail;
    }
}
