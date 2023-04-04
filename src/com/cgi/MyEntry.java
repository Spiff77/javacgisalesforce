package com.cgi;

import com.cgi.model.Orc;
import com.cgi.utils.Clavier;

import java.util.*;
import java.util.Map.Entry;

public class MyEntry {

    public static void main(String[] args) {

        HashMap<Integer, Orc> army = new HashMap<>();
        int choix = 0;

        while (choix != 4){
            System.out.println("Que voulez vous faire?");
            System.out.println("1/ Ajouter un Orc dans mon chateau");
            System.out.println("2/ Lister les orcs de mon chateau");
            System.out.println("3/ Afficher un orc par son id");
            System.out.println("4/ Quitter");

            choix = Clavier.lireInt();

            switch (choix){
                case 1:
                    System.out.print("ID (unique)>");
                    int id = Clavier.lireInt();

                    System.out.print("Nom>");
                    String name = Clavier.lireString();

                    System.out.print("Force>");
                    int force = Clavier.lireInt();

                    System.out.print("health>");
                    int health = Clavier.lireInt();

                    if(army.containsKey(id)){
                        System.out.println("Il existe dejà un Orc avec ce nom.");
                    }else{
                        army.put(id, new Orc(name, force, health));
                        System.out.println("OK");
                    }
                    break;
                case 2:
                    for (Entry e: army.entrySet()) {
                        System.out.println(e.getKey() + " --> " + e.getValue());
                    }
                    break;
                case 3:
                    System.out.print("ID>");
                    int idSelected = Clavier.lireInt();
                    if(army.containsKey(idSelected)){
                        System.out.println(army.get(idSelected));
                    }else{
                        System.out.println("Aucun id trouvé...");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Mauvaise saisir");
            }
        }
        System.out.println("Merci");
    }
}
