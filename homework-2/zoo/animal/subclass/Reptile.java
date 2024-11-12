package animal.subclass;

import animal.AnimalBasicInfo;

public class Reptile extends  AnimalBasicInfo{
    //field
    private String neededTemperature;

    //constructor

    public Reptile(){
        this.neededTemperature = "default";

    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String setName(String name) {
        return "";
    }

    public Reptile(String neededTemperature){
        this.neededTemperature = neededTemperature;
    }
    //Methode

    public String getNeededTemperature() {
        return neededTemperature;
    }

    public void setNeededTemperature(String neededTemperature) {
        this.neededTemperature = neededTemperature;
    }
}
