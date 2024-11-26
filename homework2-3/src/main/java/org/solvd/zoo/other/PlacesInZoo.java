package org.solvd.zoo.other;

import org.solvd.zoo.interfacezoo.Clean;

public class PlacesInZoo implements Clean {
    //state
    private String name;
    private String description;
    private boolean occupateByAnimal;

    //constructor

    public PlacesInZoo() {
    }

    public PlacesInZoo(String name, String description){
        this.name = name;
        this.description = description;
    }

    public PlacesInZoo(String name, String description, boolean occupateByAnimal) {
        this.name = name;
        this.description = description;
        this.occupateByAnimal = occupateByAnimal;
    }
    //methode

    @Override
    public void cleaning() {

    }

    @Override
    public void useUtilities() {

    }

    @Override
    public String toString() {
        return "PlacesInZoo{" +
                "name = '" + name + '\'' +
                ", description = '" + description + '\'' +
                ", occupateByAnimal = " + occupateByAnimal +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOccupateByAnimal() {
        return occupateByAnimal;
    }

    public void setOccupateByAnimal(boolean occupateByAnimal) {
        this.occupateByAnimal = occupateByAnimal;
    }


}
