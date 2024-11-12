/*
 * @author Nikola Lauer
 * @version 7.11 05 Nov 2024
 *
 * Test Project nr2 from first assigment for Course
 * Theme ZOO OOP
 */
import animal.AnimalBasicInfo;
import animal.subclass.*;
import contractor.Account;
import other.PlacesInZoo;
import ware.BuyWare;
import ware.Vegetable;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //animals
        Amphibie amphibie = new Amphibie();
        Bird bird = new Bird();
        Fish fish = new Fish();
        Invertebrates invertebrates =new Invertebrates();
        Mammal mammal = new Mammal();
        Reptile reptile = new Reptile();

        System.out.println(mammal.getPetName());
        mammal.setPetName("birdie");
        System.out.println(mammal.getPetName());
        mammal.eat();

        //contractor
        Account account = new Account();
        Date d = null;
        account.setDataTime(d.getTime());
        //other
        PlacesInZoo lionRun = new PlacesInZoo("Lion run", "for the lion stuff like run  and nursery for little lion cubs");
        PlacesInZoo magazinFridge = new PlacesInZoo("Magazine Fridge", "there is meat and other ware that should in freezer");

        //ware
        Vegetable vegetable = new Vegetable(true,d);

    }

}