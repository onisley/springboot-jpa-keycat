package com.example.keycat.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    private Address address;

    @Enumerated
    private DeliveryStatus status;
}
