package org.solvd.zoo.animal;

import org.solvd.zoo.contractor.Vet;

import java.util.Objects;

//Animals in the Zoo Child Class of PlacesInZoo
public abstract class AnimalBasicInfo{
    //field
    private int id =0;
    protected String name;
    protected String howMany; // not mistake that is String animals like ant are counted in colonies,
    protected boolean inZoo;

    //construction
    public AnimalBasicInfo() {
        this.id ++; // should count next
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
    public String toString() {
        return "AnimalBasicInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", howMany='" + howMany + '\'' +
                ", inZoo=" + inZoo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalBasicInfo that = (AnimalBasicInfo) o;
        return id == that.id && inZoo == that.inZoo && Objects.equals(name, that.name) && Objects.equals(howMany, that.howMany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, howMany, inZoo);
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
