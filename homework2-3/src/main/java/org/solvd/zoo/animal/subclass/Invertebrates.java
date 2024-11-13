package org.solvd.zoo.animal.subclass;

import org.solvd.zoo.animal.AnimalBasicInfo;

public class Invertebrates extends  AnimalBasicInfo{
    //field
    private String locationNeeds;
    //constructor
    public Invertebrates(){
        this.locationNeeds = "default";
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String setName(String name) {
        return "";
    }

    public Invertebrates(String locationNeeds){
        this.locationNeeds = locationNeeds;
    }
    //methode

    public String getLocationNeeds() {
        return locationNeeds;
    }

    public void setLocationNeeds(String locationNeeds) {
        this.locationNeeds = locationNeeds;
    }
}
