package com.company;

public class Main {

    public static void main(String[] args) {


        Animal cat = new Animal("cat");
        cat.name = "nyga";


        Human me=new Human();
        me.fname="Filip";
        me.lname="Piotrowicz";
        me.pet = cat;
        me.pet.feed();





    }
}
