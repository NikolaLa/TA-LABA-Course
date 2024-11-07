package other;
public class PlacesInZoo {
    //state
    private String name;
    private String description;
    private boolean occupateByAnimal;

    //constructor
    PlacesInZoo(String name, String description){
        this.name = name;
        this.description = description;
    }

    //methode

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOccupateByAnimal() {
        return occupateByAnimal;
    }

    public void setOccupateByAnimal(boolean occupateByAnimal) {
        this.occupateByAnimal = occupateByAnimal;
    }
}
