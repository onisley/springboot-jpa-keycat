package com.example.keycat.domain.item;

import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("F")
@Getter
public class Frame extends Item {

    private String color;

    private boolean isWireless;

}
