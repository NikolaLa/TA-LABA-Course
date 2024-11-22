package org.solvd.zoo.animal.subclass;

import org.solvd.zoo.animal.AnimalBasicInfo;
import org.solvd.zoo.animal.subclass.animalenum.ScaleType;

public final class Fish extends AnimalBasicInfo{
    //field
    private int watepH;
    private ScaleType scaleType;

    //constructor


    public Fish(int watepH, ScaleType scaleType) {
        this.watepH = watepH;
        this.scaleType = scaleType;
    }

    public Fish(String name, String howMany, int watepH, ScaleType scaleType) {
        super(name, howMany);
        this.watepH = watepH;
        this.scaleType = scaleType;
    }

    public Fish(String name, String petName, String howMany, boolean inZoo, int watepH, ScaleType scaleType) {
        super(name, petName, howMany, inZoo);
        this.watepH = watepH;
        this.scaleType = scaleType;
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


}
