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
        AnimalBasicInfo lizard = new AnimalBasicInfo("Lizard",1);


        //contractor
        Date d;
        Client client = new Client();
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