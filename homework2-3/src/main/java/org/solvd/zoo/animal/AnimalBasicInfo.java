package org.solvd.zoo.animal;

import org.solvd.zoo.animal.subclass.animalenum.AnimalCategory;
import org.solvd.zoo.interfacezoo.Feed;

import java.util.Objects;

//Animals in the Zoo Child Class of PlacesInZoo
public class AnimalBasicInfo implements Feed {
    //field
    private static int idCount = 0;
    private int id;
    protected String name;
    protected String petName;
    protected boolean inZoo;
    AnimalCategory animalCategory;
    ExtendAnimalInformation extendAnimalInformation;
    Parents parents;
    
    //construction
    public AnimalBasicInfo() {
        this.id = idCount++;
        this.name = "default";
        this.inZoo = true ;
    }

    public AnimalBasicInfo( String name, int howMany){
        id = id++; // should count next
        this.name = name;
        this.inZoo = true ;
    }

    public AnimalBasicInfo(String name, String petName, int howMany, boolean inZoo) {
        this.name = name;
        this.petName = petName;
        this.inZoo = inZoo;
    }

    public void animalExist(String compare, String compare2){
        if(compare.equals(compare2)){
            System.out.println("this animal name exist");
        }
    }

    //methode
    public String getName() {
        return null;
    }

    public String setName(String name) {
        return null;
    }

    @Override
    public String toString() {
        return "AnimalBasicInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", inZoo=" + inZoo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalBasicInfo that = (AnimalBasicInfo) o;
        return id == that.id && inZoo == that.inZoo && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, inZoo);
    }

    @Override
    public void feed() {
        System.out.println("Animal is hungry feed the animal");
    }
    public int getId(){
        return id;
    }

    public boolean isInZoo() {
        return inZoo;
    }

    public void setInZoo(boolean inZoo) {
        this.inZoo = inZoo;
    }




}
