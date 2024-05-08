package com.phenom.training.junit5.demo;

public record Bbq(String name) {

    public boolean isSauceInStock(String sauce) {
        return "sweet".equals(sauce) || "spicy".equals(sauce);
    }
}
