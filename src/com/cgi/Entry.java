package com.cgi;

import com.cgi.model.Artist;

public class Entry {

    public static void main(String[] args) {
        Artist a1 = new Artist();
        a1.firstName = "Frank";
        a1.lastName = "Zappa";
        a1.age = 50;


        a1.displayInfos();

    }

}
