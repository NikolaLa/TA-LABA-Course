package animal;

import other.PlacesInZoo;

//Animals in the Zoo Child Class of PlacesInZoo
public class AnimalBasicInfo{
    //field
    private int id;
    private String name;
    private String howMany; // not mistake that is String animals like ant are counted in colonies,
    boolean inZoo;

    //construction
    public AnimalBasicInfo() {
        this.id = 1 ; // should count next
        this.name = "default";
        this.howMany = "default";
        this.inZoo = true ;
    }

    public AnimalBasicInfo( String name, String howMany){
        this.id = 1 ; // should count next
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
    public int getId(){
        return id;
    }
    public int setId(int id){
        this.id = id;
        return id;
    }
    public String getHowMany(){
        return howMany;
    }
    public String setHowMany(String howMany){
        this.howMany = howMany;
        return howMany;
    }

    public boolean isInZoo() {
        return inZoo;
    }

    public void setInZoo(boolean inZoo) {
        this.inZoo = inZoo;
    }
}
