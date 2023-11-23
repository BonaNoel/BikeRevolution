package com.sfm2023.BikeRevolution.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class Customers {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    String customerName;
    String customerPhone;
    String customerDate;
    String customerDescription;
}