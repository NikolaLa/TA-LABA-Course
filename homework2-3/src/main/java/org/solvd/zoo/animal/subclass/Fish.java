package org.solvd.zoo.animal.subclass;

import org.solvd.zoo.animal.AnimalBasicInfo;

public class Fish extends AnimalBasicInfo{
    //field
    private String wateType;
    private String waterTemperature;

    //constructor
    public Fish(){
        this.wateType = "default";
        this.waterTemperature = "default";
    }
    public Fish(String waterType, String waterTemperature){
        this.wateType = waterType;
        this.waterTemperature = waterTemperature;
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

    public String getWateType() {
        return wateType;
    }

    public void setWateType(String wateType) {
        this.wateType = wateType;
    }

    public String getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(String waterTemperature) {
        this.waterTemperature = waterTemperature;
    }
}
