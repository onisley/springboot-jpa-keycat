package com.example.keycat.domain.item;

import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C")
@Getter
public class KeyCap extends Item {

    private String color;

    private int height;

}
