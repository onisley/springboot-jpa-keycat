package com.example.keycat.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("S")
@Getter @Setter
public class Switch extends Item {

    private String color;

    private int weight;

}
