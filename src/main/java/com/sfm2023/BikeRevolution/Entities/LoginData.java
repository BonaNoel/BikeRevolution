package com.sfm2023.BikeRevolution.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class LoginData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    String username;
    String password;
}
