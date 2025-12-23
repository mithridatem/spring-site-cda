package com.adrar.sitespring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="console")
@Data
public class Console {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name", nullable = false, length = 50)
    private String name;

    @Column(name="manufacturer", nullable = false, length = 50)
    private String manufacturer;
}
