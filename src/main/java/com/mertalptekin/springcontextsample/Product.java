package com.mertalptekin.springcontextsample;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private Double price;
    public Integer stock;
}
