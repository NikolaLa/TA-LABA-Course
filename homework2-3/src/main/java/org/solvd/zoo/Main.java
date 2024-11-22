package org.solvd.zoo;/*
 * @author Nikola Lauer
 * @version 7.11 05 Nov 2024
 *
 * Test Project nr2 from first assigment for Course
 * Theme ZOO OOP
 */

import org.solvd.zoo.animal.AnimalBasicInfo;
import org.solvd.zoo.animal.subclass.*;
import org.solvd.zoo.contractor.Account;
import org.solvd.zoo.contractor.Client;
import org.solvd.zoo.other.PlacesInZoo;
import org.solvd.zoo.ware.BuyWare;
import org.solvd.zoo.ware.MeatForAnimals;
import org.solvd.zoo.ware.Tools;
import org.solvd.zoo.ware.Vegetable;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //animals
        Amphibie amphibie = new Amphibie("Frog","3","swamp","warm, where it can hides");
        System.out.println(amphibie);
        Bird bird = new Bird("Magpie","4","Tree");
        System.out.println(bird);
        Fish fish = new Fish("Zebra Shark","3","inshore marine or brackish waters with depths from intertidal to 30 m (99 ft) where there are reefs and sandy, rubble, or coral bottoms");
        System.out.println(fish);
        Invertebrates invertebrates = new Invertebrates("ant","1 coloni","sandy");
        System.out.println(invertebrates);
        Reptile reptile = new Reptile("Lizard","2","35");
        System.out.println(reptile);


        //contractor
       Date d;
        Client client = new Client(d,2);
        System.out.println(client);

        //other
        PlacesInZoo lionRun = new PlacesInZoo("Lion run", "for the lion stuff like run  and nursery for little lion cubs");
        PlacesInZoo magazinFridge = new PlacesInZoo("Magazine Fridge", "there is meat and other ware that should in freezer");

        //ware
        Vegetable vegetable = new Vegetable(true, d);

        MeatForAnimals meatForAnimals = new MeatForAnimals();

        Tools tools = new Tools(true);

    }

}