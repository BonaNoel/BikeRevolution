package com.sfm2023.BikeRevolution;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Parts {
    private @NonNull Long id;
    private String partName;
    private String partQuantity;
    private String partPrice;
}
