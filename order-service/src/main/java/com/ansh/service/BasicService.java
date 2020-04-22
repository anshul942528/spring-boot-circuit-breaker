package com.ansh.service;

import com.ansh.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class BasicService {

    @Autowired
    private UserOrderService userOrderService;

    @Autowired
    private OrderDetailService orderDetailService;

    public ResponseDTO getOrderInfo(int userId) {
        ResponseDTO responseDTO = new ResponseDTO();
        UserOrders userOrders = userOrderService.getUserOrders(userId);

        List<OrderInfo> list = userOrders.getOrderList().stream()
                .map(order -> orderDetailService.getOrderDetail(order))
                .collect(Collectors.toList());
        responseDTO.setOrderInfoList(list);
        return responseDTO;
    }
}
