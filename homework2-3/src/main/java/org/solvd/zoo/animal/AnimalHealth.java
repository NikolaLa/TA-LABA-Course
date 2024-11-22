package org.solvd.zoo.animal;

import org.solvd.zoo.contractor.Vet;

public class AnimalHealth extends Vet {
    //fields
    private static int idCount = 0;
    private int id;
    private AnimalBasicInfo animalBasicInfo;
    private String title;
    private String medicine;

    //constructor
    AnimalHealth(String medicine){
        this.id = idCount++;
        this.title = "default";
        this.medicine = medicine;
    }
    AnimalHealth(String title, String medicine){
        this.id = idCount++;
        this.title = title;
        this.medicine = medicine;
    }

    //methode

    public AnimalBasicInfo getAnimalBasicInfo() {
        return animalBasicInfo;
    }

    public void setAnimalBasicInfo(AnimalBasicInfo animalBasicInfo) {
        this.animalBasicInfo = animalBasicInfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
}
