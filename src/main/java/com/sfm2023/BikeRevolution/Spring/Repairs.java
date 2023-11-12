package com.sfm2023.BikeRevolution.Spring;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Repairs {
    private @NonNull Long id;
    private String repairName;
    private Integer repairCost;
}
