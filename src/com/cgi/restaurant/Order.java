package com.cgi.restaurant;

public class Order {

    private String name;
    private Drink drink;
    private MainCourse mainCourse;
    private Dessert dessert;

    public Order(String name, Drink drink, MainCourse mainCourse, Dessert dessert) {
        this.name = name;
        this.drink = drink;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
    }

    public int totalPrice(){
        return this.drink.getPrice() + this.dessert.getPrice() + this.mainCourse.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public MainCourse getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(MainCourse mainCourse) {
        this.mainCourse = mainCourse;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
