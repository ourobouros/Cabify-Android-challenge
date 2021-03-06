package com.racobos.domain.models;

import java.io.Serializable;
import lombok.Data;

/**
 * Created by rulo7 on 09/10/2016.
 */
@Data
public class StopStation implements Serializable {
    private Double lat;
    private Double lon;
    private String address;
    private String city;
    private String country;
}
