package com.cgi.utils;

import com.cgi.model.Orc;

public class OrcHelper {

    public static Orc compare(Orc o1, Orc o2){
        if(o1.getForce() > o2.getForce()) return o1;
        else return o2;
    }

    private OrcHelper() {
    }
}
