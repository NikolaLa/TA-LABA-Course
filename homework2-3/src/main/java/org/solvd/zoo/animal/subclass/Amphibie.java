package org.solvd.zoo.animal.subclass;

import animal.AnimalBasicInfo;
import animal.Parents;

public class Amphibie extends AnimalBasicInfo {
    //field
    private String water;
    private String locationNeed; //Parents parents; // can contain parrents

    //constructor
    public Amphibie(){
        this("default","default");

        this.water = "default";
    }
    public Amphibie(String water, String locationNeed){
        this.water = water;
        this.locationNeed = locationNeed;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String setName(String name) {
        return "";
    }

    //Methode

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getLocationNeed() {
        return locationNeed;
    }

    public void setLocationNeed(String locationNeed) {
        this.locationNeed = locationNeed;
    }
}
