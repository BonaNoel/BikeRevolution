package com.sfm2023.BikeRevolution.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class Customers {
    @Id
    @GeneratedValue

    Long id;
    String customerName;
    String customerPhone;
    String customerDate;
    String customerDescription;
}
