package com.example.keycat.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C")
@Getter @Setter
public class KeyCap extends Item {

    private String color;

    private int height;

}
