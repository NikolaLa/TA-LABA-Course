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
import org.solvd.zoo.contractor.*;
import org.solvd.zoo.other.PlacesInZoo;
import org.solvd.zoo.ware.MeatForAnimals;
import org.solvd.zoo.ware.Tools;
import org.solvd.zoo.ware.Vegetable;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //animals
        AnimalBasicInfo lizard01 = new AnimalBasicInfo("Lizard","Lizy",1, true);
        System.out.println(lizard01);
        Mammal mammal01 = new Mammal("Sheep", 1,"Curly");
        System.out.println(mammal01);
        Bird bird01 = new Bird();
        System.out.println(bird01);
        Invertebrates invertebrates = new Invertebrates();
        System.out.println(invertebrates);
        Fish fish = new Fish("Shark", 1, 7, ScaleType.COSMOID);
        System.out.println(fish);

        //contractor
        Client client = new Client(LocalDate.now(),4 , TicketType.ADULT);
        System.out.println(client);
        Client client01 = new ClientGroup(LocalDate.now(),10, TicketType.GROUP);
        System.out.println(client01);
        Account accountVet = new Account(1,1);
        Vet vet = new Vet("SomeName","Some LastName",accountVet,"The Lions", "");
        System.out.println(vet);
        Employee employee01 = new Employee("John","Dohn","Cleaner");
        System.out.println(employee01);
        Account acoountSeller = new Account(2,3);
        Seller seller = new Seller("",acoountSeller,100);
        System.out.println(seller);
        Volunteer volunteer = new Volunteer("Gabriel","","", Calendar.getInstance().getTime());
        System.out.println(volunteer);
        //other
        PlacesInZoo lionRun = new PlacesInZoo("Lion run", "for the lion stuff like run  and nursery for little lion cubs");
        System.out.println(lionRun);
        PlacesInZoo magazineFridge = new PlacesInZoo("Magazine Fridge", "there is meat and other ware that should be in freezer");
        System.out.println(magazineFridge);
        //ware

        Vegetable vegetable = new Vegetable(true,null );
        System.out.println(vegetable);
        MeatForAnimals meatForAnimals = new MeatForAnimals();
        System.out.println(meatForAnimals);
        Tools tools = new Tools(true);
        System.out.println(tools);

    }

}