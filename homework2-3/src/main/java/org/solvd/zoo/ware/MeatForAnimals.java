package org.solvd.zoo.ware;

import org.solvd.zoo.interfacezoo.Feed;

import java.util.Date;

public final class MeatForAnimals implements Feed {
    //fields
     private String typeOfMeat;
     private boolean used;
     private Date experienceDate;
     private String whichFreezer;
    //construtor

    public MeatForAnimals() {
    }

    public MeatForAnimals(String typeOfMeat, boolean used, Date experienceDate, String whichFreezer) {
        this.typeOfMeat = typeOfMeat;
        this.used = used;
        this.experienceDate = experienceDate;
        this.whichFreezer = whichFreezer;
    }
    //methode
    @Override
    public void feed() {
        System.out.println("Feed Meat");
    }
    public String getTypeOfMeat() {
        return typeOfMeat;
    }

    public void setTypeOfMeat(String typeOfMeat) {
        this.typeOfMeat = typeOfMeat;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public Date getExperienceDate() {
        return experienceDate;
    }

    public void setExperienceDate(Date experienceDate) {
        this.experienceDate = experienceDate;
    }

    public String getWhichFreezer() {
        return whichFreezer;
    }

    public void setWhichFreezer(String whichFreezer) {
        this.whichFreezer = whichFreezer;
    }


}
