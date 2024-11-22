package org.solvd.zoo.animal.subclass;

import org.solvd.zoo.animal.AnimalBasicInfo;
import org.solvd.zoo.animal.subclass.animalenum.ScaleType;

import java.util.Objects;

public final class Fish extends AnimalBasicInfo{
    //field
    private int watepH;
    private ScaleType scaleType;

    //constructor


    public Fish(int watepH, ScaleType scaleType) {
        this.watepH = watepH;
        this.scaleType = scaleType;
    }

    public Fish(String name, int howMany, int watepH, ScaleType scaleType) {
        super(name, howMany);
        this.watepH = watepH;
        this.scaleType = scaleType;
    }

    public Fish(String name, String petName, int howMany, boolean inZoo, int watepH, ScaleType scaleType) {
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


    @Override
    public String toString() {
        return "Fish{" +
                "watepH=" + watepH +
                ", scaleType=" + scaleType +
                ", name='" + name + '\'' +
                ", petName='" + petName + '\'' +
                ", inZoo=" + inZoo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Fish fish)) return false;
        if (!super.equals(o)) return false;
        return watepH == fish.watepH && scaleType == fish.scaleType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), watepH, scaleType);
    }
}
