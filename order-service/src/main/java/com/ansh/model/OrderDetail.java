package com.ansh.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OrderDetail {

    private double price;

    @JsonProperty("zip_code")
    private int zipCode;

    @JsonProperty("item_name")
    private String itemName;
}
