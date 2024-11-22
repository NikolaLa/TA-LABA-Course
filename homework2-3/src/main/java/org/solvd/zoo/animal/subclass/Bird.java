package org.solvd.zoo.animal.subclass;

import org.solvd.zoo.animal.AnimalBasicInfo;
import org.solvd.zoo.animal.Parents;
import org.solvd.zoo.animal.subclass.animalenum.Beaks;

import java.util.BitSet;

public final class Bird extends AnimalBasicInfo{
    //field
    private String locationNest;
    private Beaks beaks;
    //Parents parent; // can have parents

    //construct
    public Bird(){
        Beaks beaks = this.beaks.NONE;
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

    public Bird(String name, String howMany, String locationNest) {
        super(name, howMany);
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
