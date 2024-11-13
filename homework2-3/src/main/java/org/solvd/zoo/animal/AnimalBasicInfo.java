package org.solvd.zoo.animal;

//Animals in the Zoo Child Class of PlacesInZoo
public abstract class AnimalBasicInfo{
    //field
    private int id;
    protected String name;
    protected String howMany; // not mistake that is String animals like ant are counted in colonies,
    protected boolean inZoo;

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
    public void animalExist(String compare, String compare2){
        if(compare.equals(compare2)){
            System.out.println("this animal name exist");
        }
    }

    //methode
    abstract public String getName();

    abstract public String setName(String name);

    @Override
    public String toString(){
        return (id+ " " + name + "" + howMany + " "+ inZoo );
    }
    @Override
    public int hashCode(){

        return 0;
    }
    @Override
    public boolean equals(Object e){
        return equals(e) ;
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
