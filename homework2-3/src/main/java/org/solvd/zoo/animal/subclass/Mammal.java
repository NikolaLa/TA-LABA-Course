package org.solvd.zoo.animal.subclass;

import org.solvd.zoo.animal.AnimalBasicInfo;


public final class Mammal extends AnimalBasicInfo {
    //field
    private String furType;
    //construction


    public Mammal(String furType) {
        this.furType = furType;
    }

    public Mammal(String name, String howMany, String furType) {
        super(name, howMany);
        this.furType = furType;
    }

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
