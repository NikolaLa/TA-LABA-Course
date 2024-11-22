package org.solvd.zoo.animal.subclass;

import org.solvd.zoo.animal.AnimalBasicInfo;
import org.solvd.zoo.animal.subclass.animalenum.Beaks;
import org.solvd.zoo.animal.subclass.animalenum.LocationOfNest;

public final class Bird extends AnimalBasicInfo{
    //field
    private LocationOfNest locationNest;
    private Beaks beaks;
    //Parents parent; // can have parents

    //construct
    public Bird(){
        Beaks beaks = this.beaks.NONE;
        LocationOfNest location = this.locationNest;
    }

    public Bird(LocationOfNest locationNest, Beaks beaks) {
        this.locationNest = locationNest;
        this.beaks = beaks;
    }

    public Bird(String name, int howMany, LocationOfNest locationNest, Beaks beaks) {
        super(name, howMany);
        this.locationNest = locationNest;
        this.beaks = beaks;
    }

    public Bird(String name, String petName, int howMany, boolean inZoo, LocationOfNest locationNest, Beaks beaks) {
        super(name, petName, howMany, inZoo);
        this.locationNest = locationNest;
        this.beaks = beaks;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String setName(String name) {
        return "";
    }

    public Bird( LocationOfNest locationNest){
    this.locationNest = locationNest;
    }

    public Bird(String name, int howMany, LocationOfNest locationNest) {
        super(name, howMany);
        this.locationNest = locationNest;
    }
    //methode

    public LocationOfNest getLocationNest() {
        return locationNest;
    }

    public void setLocationNest(LocationOfNest locationNest) {
        this.locationNest = locationNest;
    }
}
