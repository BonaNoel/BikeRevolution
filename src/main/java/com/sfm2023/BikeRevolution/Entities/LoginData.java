package com.sfm2023.BikeRevolution.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class LoginData {
    @Id
    @GeneratedValue

    Long id;
    String username;
    String password;
}
