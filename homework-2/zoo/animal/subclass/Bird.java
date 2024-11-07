package animal.subclass;

import animal.AnimalBasicInfo;
import animal.Parents;

import java.util.BitSet;

public class Bird extends AnimalBasicInfo{
    //field
    private String locationNest;
    //Parents parent; // can have parents

    //construct
    public Bird(){
        this.locationNest = "default";
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