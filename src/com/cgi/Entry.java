package com.cgi;

import com.cgi.model.bank.Employee;
import com.cgi.model.zik.Album;
import com.cgi.model.zik.Artist;
import com.cgi.parking.Car;
import com.cgi.parking.Parking;
import com.cgi.restaurant.*;

public class Entry {

    public static void main(String[] args) {

        Order o = new Order("Commande 1", Drink.COKE, MainCourse.SALAD, Dessert.BABA);
        Order o1 = new Order("Commande 2", Drink.COKE, MainCourse.SALAD, Dessert.BABA);
        Restaurant r = new Restaurant("Flunch");

        r.add(o);
        r.add(o1);

        r.displayTotalPrice();
    }

}
