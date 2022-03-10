package com.example.keycat.domain.item;

import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("S")
@Getter
public class Switch extends Item {

    private String color;

    private int weight;

}
