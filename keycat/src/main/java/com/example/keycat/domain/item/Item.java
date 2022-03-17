package com.example.keycat.domain.item;

import com.example.keycat.domain.Category;
import com.example.keycat.exception.NotEnoughStockException;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Getter
@Setter
public abstract class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;

    private int price;

    private int stockQuantity;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories;

    /**
     * 재고 증가
     */
    public void addStock(int quantity) {
        this.stockQuantity += quantity;
    }

    public void removeStock(int quantity) {
        int remainStock = this.stockQuantity - quantity;
        if (remainStock < 0) {
            throw new NotEnoughStockException("재고 수량이 부족합니다.");
        }

        this.stockQuantity = remainStock;
    }
}
