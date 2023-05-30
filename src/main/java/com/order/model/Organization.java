package com.order.model;

import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;

@Entity
@Data
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 40)
    private String organization;
    @Column(length = 40)
    private String speciality;
    private int count;
    private int year;
}
