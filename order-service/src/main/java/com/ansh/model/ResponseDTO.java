package com.ansh.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ResponseDTO {

    @JsonProperty("order_info_list")
    private List<OrderInfo> orderInfoList;
}
