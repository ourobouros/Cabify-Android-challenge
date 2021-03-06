package com.racobos.domain.models;

import java.io.Serializable;

import lombok.Data;

/**
 * Created by rulo7 on 09/10/2016.
 */
@Data
public class Journey implements Serializable {
    private Vehicle vehicle;
    private Double totalPrice;
    private String formattedPrice;
    private String currency;
    private String currencySymbol;
}
