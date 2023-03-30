package com.cgi;

import com.cgi.model.Artist;

public class Entry {

    public static void main(String[] args) {
        Artist a1 = new Artist("Thomas", "Lhomme", 37);
        Artist a2 = new Artist("Roger", "Water", 90);

        a1.setAge(30);

        System.out.println(a1.getAge());

    }

}
