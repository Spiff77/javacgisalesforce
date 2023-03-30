package com.cgi.model;

public class Artist {

    private String firstName;
    private String lastName;
    private int age;
    private String stageName;

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
        this(firstName, lastName, age);
        this.stageName = stageName;
    }

    public Artist(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.stageName = this.stageName == null ?  this.firstName + " " + this.lastName : this.stageName;
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

    public void performWith(Artist artist) {
        System.out.println(this.stageName + " allume le feu avec " + artist.stageName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }
}
