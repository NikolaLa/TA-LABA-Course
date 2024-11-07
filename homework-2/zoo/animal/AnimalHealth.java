package animal;

import contractor.Vet;

public class AnimalHealth extends Vet {
    //fields
    private AnimalBasicInfo animalBasicInfo;
    private String title;
    private String medicine;

    //constructor
    AnimalHealth(String medicine){
        this.title = "default";
        this.medicine = medicine;
    }
    AnimalHealth(String title, String medicine){
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
