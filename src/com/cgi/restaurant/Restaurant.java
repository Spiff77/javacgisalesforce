package com.cgi.restaurant;

public class Restaurant {

    private String name;
    private Order orders[] = new Order[10];

    public Restaurant(String name) {
        this.name = name;
    }

    public void add(Order order){
        for (int i=0; i< this.orders.length; i++){
            if(this.orders[i] == null){
                this.orders[i] = order;
                break;
            }
        }
    }

    public void displayTotalPrice(){
        System.out.print("Le pris total des commandes du restaurant " + this.name + " est de: ");
        int total = 0;

        for (Order o: this.orders) {
            if(o != null)
                total += o.totalPrice();
        }
        System.out.println(total);
    }
}
