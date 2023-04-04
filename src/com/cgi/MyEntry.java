package com.cgi;

import com.cgi.model.Orc;
import com.cgi.utils.Clavier;

import java.util.*;
import java.util.Map.Entry;

public class MyEntry {

    public static void main(String[] args) {

        HashMap<Orc, List<Orc>> teams = new HashMap<>();

        teams.put(new Orc("sfdz", 23, 23), Arrays.asList(new Orc("sdgfds", 20, 39), new Orc("gdfg", 20, 39)));
        teams.put(new Orc("hrzh", 23, 23), Arrays.asList(new Orc("sdgeffds", 20, 39), new Orc("gdaffg", 20, 39)));

        int i = 0;
        for (Entry<Orc, List<Orc>> entry: teams.entrySet()){
            System.out.println("Chef equipe " + (++i) + ": " +entry.getKey().getName());
            for (Orc o: entry.getValue()) {
                System.out.println("\t "+o.getName());
            }
        }
    }
}
