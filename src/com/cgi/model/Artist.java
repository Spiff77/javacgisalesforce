package com.cgi.model;

public class Artist {

    public String firstName;
    public String lastName;
    public int age;
    public String stageName;

    public  void displayInfos(){
        createDefaultStageName();
        System.out.println(firstName + " " + lastName + " " + age + " " + stageName);
    }

    public void changeAge(int age) {
        this.age = age;
    }

    public void anniversary(){
        this.age++;
    }

    public void createDefaultStageName(){
        this.stageName = this.stageName == null ?  this.firstName + " " + this.lastName : null;
    }

}
