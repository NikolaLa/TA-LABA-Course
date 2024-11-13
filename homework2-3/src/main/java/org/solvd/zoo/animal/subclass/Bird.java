package org.solvd.zoo.animal.subclass;

import org.solvd.zoo.animal.AnimalBasicInfo;
import org.solvd.zoo.animal.Parents;
import java.util.BitSet;

public class Bird extends AnimalBasicInfo{
    //field
    private String locationNest;
    //Parents parent; // can have parents

    //construct
    public Bird(){
        this.locationNest = "default";
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String setName(String name) {
        return "";
    }

    public Bird(String locationNest){
    this.locationNest = locationNest;
    }
    //methode

    public String getLocationNest() {
        return locationNest;
    }

    public void setLocationNest(String locationNest) {
        this.locationNest = locationNest;
    }
}
