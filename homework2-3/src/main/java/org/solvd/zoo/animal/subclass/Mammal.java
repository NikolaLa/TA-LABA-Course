package org.solvd.zoo.animal.subclass;

import org.solvd.zoo.animal.AnimalBasicInfo;
import org.solvd.zoo.animal.Parents;


public final class Mammal extends AnimalBasicInfo {
    //field
    private String pet;


    //construction




    //methode
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String setName(String name)
    {
        this.name = name;
        return name;
    }

    public void eat() {
    System.out.println("dinner time");
}

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
