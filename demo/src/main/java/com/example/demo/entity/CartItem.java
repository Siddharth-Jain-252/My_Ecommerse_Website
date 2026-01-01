package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cart_items")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartItemId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "cart_id",
        nullable = false
    )
    private Cart cart;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id",
        nullable = false,
        unique = true
    )
    private Product product;

    private int quantity;

    private String size;

}
