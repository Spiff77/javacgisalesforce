package com.cgi;

import com.cgi.model.Orc;
import com.cgi.utils.Clavier;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MyEntry {

    public static void main(String[] args) {

        HashMap<Orc, List<Orc>> teams = new HashMap<>();

        teams.put(new Orc("sfdz", 23, 20), Arrays.asList(new Orc("sdgfds", 10, 39), new Orc("gdfg", 15, 39)));
        teams.put(new Orc("hrzh", 20, 23), Arrays.asList(new Orc("sdgeffds", 20, 39), new Orc("gdaffg", 20, 39)));
        AtomicInteger atomicInteger = new AtomicInteger(1);
        List<String> result = teams.entrySet().stream()
                .mapToInt( e ->
                        e.getKey().getHealth() + e.getValue().stream()
                            .mapToInt( v -> v.getHealth()).sum())
                .boxed()
                .map(v -> {
                   return "Equipe "+atomicInteger.getAndIncrement()+ ": " + v;
                })
                .collect(Collectors.toList());


        System.out.println(result);
    }
}
