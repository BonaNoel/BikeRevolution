package com.sfm2023.BikeRevolution.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class WebCustomers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    String name;
    String phone;
    String date;
    String description;

}