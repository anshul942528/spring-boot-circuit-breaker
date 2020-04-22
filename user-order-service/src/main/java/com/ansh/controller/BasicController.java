package com.ansh.controller;

import com.ansh.model.UserOrders;
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

    @RequestMapping(value = "/order/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserOrders getRequest(@PathVariable("userId") int userId){
        log.info("Basic controller : getRequest method");
        return basicService.getOrders(userId);
    }
}
