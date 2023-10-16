package com.sfm2023.BikeRevolution;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor

public class Parts {
    @Id
    @GeneratedValue
    private int ID;
    private int Belso;
    private String Torzsvendeg;
}
