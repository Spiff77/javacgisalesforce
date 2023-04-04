package com.cgi;

import com.cgi.model.Orc;
import com.cgi.restaurant.*;
import com.cgi.utils.Clavier;
import parking.Boat;
import parking.Car;
import parking.Parking;
import parking.Plane;

import java.util.HashSet;

public class Entry {

    public static void main(String[] args) {

        HashSet<Orc> army = new HashSet<>();
        int choix = 0;
        while (choix != 3){
            System.out.println("Que voulez vous faire?");
            System.out.println("1/ Ajouter un Orc dans mon chateau");
            System.out.println("2/ Lister les orcs de mon chateau");
            System.out.println("3/ Quitter");

            choix = Clavier.lireInt();

            switch (choix){
                case 1:
                    System.out.print("Nom>");
                    String name = Clavier.lireString();

                    System.out.print("Force>");
                    int force = Clavier.lireInt();

                    System.out.print("health>");
                    int health = Clavier.lireInt();

                    if(!army.add(new Orc(name, health ,force))){
                        System.out.println("Il existe dejà un Orc avec ce nom.");
                    }else{
                        System.out.println("OK");
                    }
                    break;
                case 2:
                    for (Orc o: army) {
                        System.out.println(o);
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Mauvaise saisir");
            }
        }
        System.out.println("Merci");
    }

}
