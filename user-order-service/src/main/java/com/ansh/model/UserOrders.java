package com.ansh.model;

import lombok.Data;

import java.util.List;

@Data
public class UserOrders {

    private List<Order> orderList;
}
