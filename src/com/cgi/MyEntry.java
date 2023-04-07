package com.cgi;

import com.cgi.model.Orc;
import com.cgi.singleton.CoffeeMachine;
import com.cgi.singleton.Computer;
import com.cgi.singleton.Printer;
import com.cgi.singleton.Repartitor;
import com.cgi.utils.Clavier;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MyEntry {

    public static void main(String[] args) {
        Computer c1 = new Computer("Genevieve de la compta");
        Computer c2 = new Computer("fred du marketing");
        Computer c3 = new Computer("Jean jean du managment");
        CoffeeMachine cm1 = new CoffeeMachine("What else");
        CoffeeMachine cm2 = new CoffeeMachine("Super Cafe 2000");

        Printer p1 = new Printer("Epson");
        Printer p2 = new Printer("Canon");
        Printer p3 = new Printer("Fuji");

        Repartitor.getInstance().add(p1);
        Repartitor.getInstance().add(p2);
        Repartitor.getInstance().add(p3);

        c1.print("Hello");
        c2.print("Hello");
        c3.print("Hello");
        c2.print("Hello");
        cm1.print("Hello");
        c3.print("Hello");
        c1.print("Hello");
        cm2.print("Hello");
        c3.print("Hello");
    }
}
