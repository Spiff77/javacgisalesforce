package com.cgi.restaurant;

public enum Drink {
    COKE(2), WATER(1), BEER(3);

    private int price;

    Drink(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
