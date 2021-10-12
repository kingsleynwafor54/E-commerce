package com.ecommerce.shop.data.model;

import lombok.Data;

import javax.persistence.*;
//How to do a subscription on your webapp
@Entity
@Data
public class Newsletter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String email;
}
