package com.cgi.singleton;

public class Printer {
    private String name;

    public Printer(String name) {
        this.name = name;
    }

    public void print(String text){
        System.out.println(text + " sur "+ this.name);
    }

    public String getName() {
        return name;
    }
}
