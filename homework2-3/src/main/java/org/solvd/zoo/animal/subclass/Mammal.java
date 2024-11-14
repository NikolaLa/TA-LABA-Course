package org.solvd.zoo.animal.subclass;

import org.solvd.zoo.animal.AnimalBasicInfo;
import org.solvd.zoo.animal.Parents;


public class Mammal extends AnimalBasicInfo {
    //field
    private String petName;
    //Parents parents; //can have parents


    //construction

    public Mammal(){
        this.petName = "Fluffy";
    }
    public Mammal(String petName){
        this.petName = petName;
    }

    public Mammal(String name, String howMany, String petName) {
        super(name, howMany);
        this.petName = petName;
    }

    //    Mammal(AnimalBasicInfo animalBasicInfo){
//
//        this.animalBasicInfo = animalBasicInfo;
//    }
//    Mammal(AnimalBasicInfo animalBasicInfo, Parents parents){
//        this.animalBasicInfo = animalBasicInfo;
//        this.parents = parents;
//    }
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
