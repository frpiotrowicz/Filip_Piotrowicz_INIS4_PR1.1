package com.company;
import java.io.File;
public class Animal{
    String name;
    final String species;
    Double weight;

    static final double defDogWeight = 30;
    static final double defCatWeight = 5;
    static final double defFishWeight = 0.1;

    public Animal (String comp)
    {
        this.species = comp;
        if ( comp == "dog")
        {
            this.weight = defDogWeight;
        }
        else if (comp == "cat")
        {
            this.weight = defCatWeight;
        }
        else if (comp == "fish")
        {
            this.weight = defFishWeight;
        }
    }

    void feed()
    {
        if (weight>0)
        {
            weight=weight+0.1;
            System.out.println("my current weight is "+ weight);
        }
        else
        {
            System.out.println("dead do not eat");
        }
    }




}
