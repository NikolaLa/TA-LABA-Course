package animal;

public class Amphibie {
    //field
    AnimalBasicInfo animalBasicInfo;
    Parents parents;

    //constructor
    Amphibie(AnimalBasicInfo animalBasicInfo){
        this.animalBasicInfo = animalBasicInfo;
    }
    Amphibie(AnimalBasicInfo animalBasicInfo, Parents parents){
        this.animalBasicInfo = animalBasicInfo;
        this.parents = parents;
    }
    //Methode

}
