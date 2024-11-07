package animal.subclass;

import animal.AnimalBasicInfo;
import animal.Parents;


public class Mammal extends AnimalBasicInfo {
    //field
    private String petName;
    //Parents parents; //can have parents


    //construction

    public Mammal(){
        this.petName = "Fluffy";
    }
    public Mammal(String petName){
        this.petName = petName;
    }

//    Mammal(AnimalBasicInfo animalBasicInfo){
//
//        this.animalBasicInfo = animalBasicInfo;
//    }
//    Mammal(AnimalBasicInfo animalBasicInfo, Parents parents){
//        this.animalBasicInfo = animalBasicInfo;
//        this.parents = parents;
//    }
    //methode
    public void eat() {
    System.out.println("dinner time");
}

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
