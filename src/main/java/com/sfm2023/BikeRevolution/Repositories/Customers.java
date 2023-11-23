package com.sfm2023.BikeRevolution.Repositories;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customers {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    String customerName;
    String customerPhone;
    String customerDate;
    String customerDescription;
}