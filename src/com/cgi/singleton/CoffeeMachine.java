package com.cgi.singleton;

public class CoffeeMachine {
    private String name;

    public CoffeeMachine(String name) {
        this.name = name;
    }

    public void print(String text){
        System.out.print("Printing from " + name + ":");
        Repartitor.getInstance().print(text);
    }

    public String getName() {
        return name;
    }
}
