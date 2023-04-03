package com.cgi.restaurant;

public enum Dessert {
    BABA(2), BROWNIE(4);

    private int price;

    Dessert(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
