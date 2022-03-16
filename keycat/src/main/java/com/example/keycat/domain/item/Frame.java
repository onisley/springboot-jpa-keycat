package com.example.keycat.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("F")
@Getter @Setter
public class Frame extends Item {

    private String color;

    private boolean isWireless;

}
