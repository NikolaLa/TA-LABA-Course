package org.solvd.zoo.animal.subclass;

import org.solvd.zoo.animal.AnimalBasicInfo;

public final class Invertebrates extends  AnimalBasicInfo{
    //field
    private String locationNeeds;
    //constructor
    public Invertebrates(){
        this.locationNeeds = "default";
    }


    public Invertebrates(String locationNeeds){
        this.locationNeeds = locationNeeds;
    }

    public Invertebrates(String name, String howMany, String locationNeeds) {
        super(name, howMany);
        this.locationNeeds = locationNeeds;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String setName(String name) {
        return "";
    }

    //methode

    public String getLocationNeeds() {
        return locationNeeds;
    }

    public void setLocationNeeds(String locationNeeds) {
        this.locationNeeds = locationNeeds;
    }
}
