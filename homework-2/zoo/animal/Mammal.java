package animal;

//Animals in the Zoo Child Class of PlacesInZoo
public class Mammal{
    //stat
    AnimalBasicInfo animalBasicInfo;
    Parents parents;
    //construction
    Mammal(AnimalBasicInfo animalBasicInfo){
        this.animalBasicInfo = animalBasicInfo;
    }
    Mammal(AnimalBasicInfo animalBasicInfo, Parents parents){
        this.animalBasicInfo = animalBasicInfo;
        this.parents = parents;
    }
    //methode
}
