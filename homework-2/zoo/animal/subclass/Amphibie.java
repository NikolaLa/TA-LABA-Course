package animal.subclass;

import animal.AnimalBasicInfo;
import animal.Parents;

public class Amphibie extends AnimalBasicInfo {
    //field
    String water;
    Parents parents;

    //constructor
    Amphibie(String water){
        this(water);
        this.water = "swamps";
    }
    Amphibie( Parents parents){
        this.parents = parents;
    }
    //Methode

}
