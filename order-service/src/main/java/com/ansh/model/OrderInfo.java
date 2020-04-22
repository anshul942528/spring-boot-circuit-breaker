package com.ansh.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderInfo {

    private double price;

    @JsonProperty("zip_code")
    private int zipCode;

    @JsonProperty("item_name")
    private String itemName;

    @JsonProperty("order_id")
    private int orderId;

    private String status;
}
