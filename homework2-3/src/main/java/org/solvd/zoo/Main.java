package org.solvd.zoo;/*
 * @author Nikola Lauer
 * @version 22 Nov 2024
 *
 * Test Project nr2 from first assigment for Course
 * Theme ZOO OOP
 */

import org.solvd.zoo.animal.AnimalBasicInfo;
import org.solvd.zoo.animal.subclass.*;
import org.solvd.zoo.animal.subclass.animalenum.ScaleType;
import org.solvd.zoo.contractor.Client;
import org.solvd.zoo.other.PlacesInZoo;
import org.solvd.zoo.ware.MeatForAnimals;
import org.solvd.zoo.ware.Tools;
import org.solvd.zoo.ware.Vegetable;

public class Main {
    public static void main(String[] args) {
        //animals
        AnimalBasicInfo lizard01 = new AnimalBasicInfo("Lizard","Lizy",1, true);
        Mammal mammal01 = new Mammal("Sheep", 1,"Curly");
        Bird bird01 = new Bird();
        Invertebrates invertebrates = new Invertebrates();
        Fish fish = new Fish("Shark", 1, 7, ScaleType.COSMOID);
        System.out.println(fish);
        //contractor
        //Client client = new Client(buyDate, count);
        //System.out.println(client);

        //other
        PlacesInZoo lionRun = new PlacesInZoo("Lion run", "for the lion stuff like run  and nursery for little lion cubs");
        PlacesInZoo magazinFridge = new PlacesInZoo("Magazine Fridge", "there is meat and other ware that should in freezer");

        //ware

        Vegetable vegetable = new Vegetable(true,null );

        MeatForAnimals meatForAnimals = new MeatForAnimals();

        Tools tools = new Tools(true);

    }

}