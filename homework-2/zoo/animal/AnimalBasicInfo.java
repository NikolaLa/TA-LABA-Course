package animal;

import other.PlacesInZoo;

//Animals in the Zoo Child Class of PlacesInZoo
public class AnimalBasicInfo{
    //field
    private String name;
    private String howMany; // not mistake that is String animals like ant are counted in colonies,
    boolean inZoo;

    //construction
    public AnimalBasicInfo(String name, String howMany){
        this.name = name;
        this.howMany = howMany;
        this.inZoo = true ;
    }

    //methode
    public String getName(){
    return name;
    }
    public String setName(String name)
    {
        this.name = name;
        return name;
    }


}
