package com.zeroone.project.entity;

import com.zeroone.project.enums.CurrencyId;
import com.zeroone.project.enums.Sizes;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tshirts")
@Getter
@Setter
public class Tshirt extends BaseEntity{
    @Column(name = "sku")
    private long sku;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "availableSizes")
    private Sizes availableSizes;

    @Column(name = "style")
    private String style;

    @Column(name = "price")
    private double price;

    @Column(name = "installments")
    private int installments;

    @Enumerated(EnumType.STRING)
    @Column(name = "currencyId")
    private CurrencyId currencyId;

    @Column(name = "currencyFormat")
    private String currencyFormat;

    @Column(name = "isFreeShipping")
    private boolean isFreeShipping;
}
