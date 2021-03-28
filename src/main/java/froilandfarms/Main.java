package froilandfarms;

import froilandfarms.animals.Chicken;
import froilandfarms.animals.Horse;
import froilandfarms.crops_and_produce.*;
import froilandfarms.farm.*;
import froilandfarms.people.Farmer;
import froilandfarms.people.Pilot;
import froilandfarms.vehicles.CropDuster;
import froilandfarms.vehicles.Tractor;

public class Main {

    public static void main(String[] args) {
        Farmer farmer1 = new Farmer("Froilan");
        Tractor froilansTractor = new Tractor();
        Chicken charlesTheChicken = new Chicken();
        CropDuster froilandasCropDuster = new CropDuster();
        Pilot froilanda = new Pilot("Froilanda");
        EdibleEgg edibleEgg = new EdibleEgg();
        Farm froilandFarms = new Farm();
        Crops tomatos = new TomatoPlant();
        Crops corn = new Corn();
        Crops greenbeans = new GreenBean();
        Crops cucumbers = new Cucumber();
        Crops carrots = new Carrot();

        // The farm has 3 stables
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();
        froilandFarms.stables.add(stable1);
        froilandFarms.stables.add(stable2);
        froilandFarms.stables.add(stable3);

        //10 horses
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        Horse horse4 = new Horse();
        Horse horse5 = new Horse();
        Horse horse6 = new Horse();
        Horse horse7 = new Horse();
        Horse horse8 = new Horse();
        Horse horse9 = new Horse();
        Horse horse10 = new Horse();

        //assign horses to their stables
        stable1.horses.add(horse1);
        stable1.horses.add(horse2);
        stable1.horses.add(horse3);

        stable2.horses.add(horse4);
        stable2.horses.add(horse5);
        stable2.horses.add(horse6);
        stable2.horses.add(horse7);

        stable3.horses.add(horse8);
        stable3.horses.add(horse9);
        stable3.horses.add(horse10);

        //Makes four chicken coops 15 chickens
        ChickenCoop coop1 = new ChickenCoop();
        ChickenCoop coop2 = new ChickenCoop();
        ChickenCoop coop3 = new ChickenCoop();
        ChickenCoop coop4 = new ChickenCoop();
        froilandFarms.coops.add(coop1);
        froilandFarms.coops.add(coop2);
        froilandFarms.coops.add(coop3);
        froilandFarms.coops.add(coop4);

        //creating 15 chickens, assigning to coops
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        Chicken chicken4 = new Chicken();
        coop1.chickens.add(chicken1);
        coop1.chickens.add(chicken2);
        coop1.chickens.add(chicken3);
        coop1.chickens.add(chicken4);

        Chicken chicken5 = new Chicken();
        Chicken chicken6 = new Chicken();
        Chicken chicken7 = new Chicken();
        Chicken chicken8 = new Chicken();
        coop2.chickens.add(chicken5);
        coop2.chickens.add(chicken6);
        coop2.chickens.add(chicken7);
        coop2.chickens.add(chicken8);

        Chicken chicken9 = new Chicken();
        Chicken chicken10 = new Chicken();
        Chicken chicken11= new Chicken();
        Chicken chicken12= new Chicken();
        coop3.chickens.add(chicken9);
        coop3.chickens.add(chicken10);
        coop3.chickens.add(chicken11);
        coop3.chickens.add(chicken12);

        Chicken chicken13 = new Chicken();
        Chicken chicken14 = new Chicken();
        Chicken chicken15= new Chicken();
        coop4.chickens.add(chicken13);
        coop4.chickens.add(chicken14);
        coop4.chickens.add(chicken15);

        //making field with croprow
        Field field = new Field();
        froilandFarms.field.add(field);

        field.cropRows.add(corn);
        field.cropRows.add(tomatos);
        field.cropRows.add(cucumbers);
        field.cropRows.add(greenbeans);
        field.cropRows.add(carrots);

        //farm vehicles
        froilandFarms.vehicles.add(froilandasCropDuster);
        froilandFarms.vehicles.add(froilansTractor);

        //farmhouse
        FarmHouse farmHouse = new FarmHouse();

        //some stuff to do around the farm

        farmer1.mount(horse1);
        farmer1.dismount(horse1);
        froilanda.mount(froilandasCropDuster);
        froilanda.dismount(froilandasCropDuster);
        farmer1.mount(froilansTractor);
        farmer1.dismount(froilansTractor);
        froilandasCropDuster.operate(tomatos);
        charlesTheChicken.yield(edibleEgg);
        froilanda.eat(edibleEgg);
        horse1.eat(corn);
    }
}

