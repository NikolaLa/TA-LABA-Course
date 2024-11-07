/*
 * @author Nikola Lauer
 * @version 7.11 05 Nov 2024
 *
 * Test Project nr2 from first assigment for Course
 * Theme ZOO OOP
 */
import animal.AnimalBasicInfo;
import animal.subclass.*;

public class Main {
    public static void main(String[] args) {
        Amphibie amphibie = new Amphibie();
        Bird bird = new Bird();
        Fish fish = new Fish();
        Invertebrates invertebrates =new Invertebrates();
        Mammal mammal = new Mammal();
        Reptile reptile = new Reptile();
        mammal.setPetName("birdie");
        System.out.println(mammal.getPetName());
    }

}