package com.cgi.restaurant;

public enum MainCourse {
    SALAD(2), FISHANDCHIPS(4), MOUSSAKA(6);

    private int price;

    MainCourse(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
