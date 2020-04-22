package com.ansh.controller;

import com.ansh.model.OrderDetail;
import com.ansh.service.BasicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BasicController {

    @Autowired
    private BasicService basicService;

    @RequestMapping(value = "/info/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public OrderDetail getRequest(@PathVariable("orderId") int orderId){
        log.info("Basic controller : getRequest method");
        return basicService.getOrderInfo(orderId);
    }
}
