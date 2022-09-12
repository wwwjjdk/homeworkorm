package com.example.ormhomework.model;

import lombok.*;
import lombok.experimental.FieldDefaults;


import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    String dataTime;

    @Column(nullable = false)
    String productName;

    int price;

}
