package com.cgi.model;

public class Artist {

    public String firstName;
    public String lastName;
    public int age;
    public String stageName;

  /**
   *  Réecriture du constructeur par défault
   **/
    public Artist() {
        this.firstName = "UNKNOW";
        this.lastName = "UNKNOW";
        this.stageName = "UNKNOW";
        this.age = 0;
    }

    public Artist(String firstName, String lastName, int age, String stageName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.stageName = stageName;
    }

    public Artist(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.stageName = this.firstName + " " + this.lastName;
    }

    public  void displayInfos(){
        System.out.println(firstName + " " + lastName + " " + age + " " + stageName);
    }

    public void changeAge(int age) {
        this.age = age;
    }

    public void anniversary(){
        this.age++;
    }

    public void createDefaultStageName(){
        this.stageName =  this.firstName + " " + this.lastName;
    }

}
