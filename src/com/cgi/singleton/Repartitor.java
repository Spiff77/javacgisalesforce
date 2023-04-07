package com.cgi.singleton;

import java.util.ArrayList;
import java.util.List;

public class Repartitor {

    private static Repartitor INSTANCE;
    private int currentPrinterIndex = 0;
    private List<Printer> printers = new ArrayList<>();

    private Repartitor(){}

    public static Repartitor getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Repartitor();
        }
        return INSTANCE;
    }

    public void add(Printer printer){
        this.printers.add(printer);
    }

    public void print(String text){
        this.printers.get(currentPrinterIndex++).print(text);
        if(this.currentPrinterIndex >= this.printers.size()){
            this.currentPrinterIndex = 0;
        }
    }
}
