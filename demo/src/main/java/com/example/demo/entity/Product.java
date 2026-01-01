package com.example.demo.entity;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creator_id")
    private Creator creator;

    @Column(nullable = false)
    private String productName;

    @Lob
    @Column(nullable = false)
    private String description;

    @Column(
        nullable = false,
        precision = 1,
        scale = 2
    )
    private double rating;

    @Column(nullable = false)
    private int numberOfRating;

    @Column(nullable = false)
    private String imageURL;

    @Column(
        nullable = false,
        precision = 10,
        scale = 2
    )
    private BigDecimal price;

    private int discount;
    
    @Column(nullable = false)
    private String productType;

}
