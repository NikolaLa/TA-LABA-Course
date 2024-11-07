package animal.subclass;

import animal.AnimalBasicInfo;

public class Invertebrates extends  AnimalBasicInfo{
    //field
    private String locationNeeds;
    //constructor
    public Invertebrates(){
        this.locationNeeds = "default";
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
