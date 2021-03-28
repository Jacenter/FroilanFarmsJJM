package farm;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Farm froilanFarm = new Farm();

        //makes the stables 10 horses
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();
        froilanFarm.stables.add(stable1);
        froilanFarm.stables.add(stable2);
        froilanFarm.stables.add(stable3);

        //creating 10 horse objects, assigning them to stables
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        stable1.horses.add(horse1);
        stable1.horses.add(horse2);
        stable1.horses.add(horse3);

        Horse horse4 = new Horse();
        Horse horse5 = new Horse();
        Horse horse6 = new Horse();
        Horse horse7 = new Horse();
        stable2.horses.add(horse4);
        stable2.horses.add(horse5);
        stable2.horses.add(horse6);
        stable2.horses.add(horse7);

        Horse horse8 = new Horse();
        Horse horse9 = new Horse();
        Horse horse10 = new Horse();
        stable3.horses.add(horse8);
        stable3.horses.add(horse9);
        stable3.horses.add(horse10);


        //Makes four chicken coops 15 chickens
        ChickenCoop coop1 = new ChickenCoop();
        ChickenCoop coop2 = new ChickenCoop();
        ChickenCoop coop3 = new ChickenCoop();
        ChickenCoop coop4 = new ChickenCoop();
        froilanFarm.coops.add(coop1);
        froilanFarm.coops.add(coop2);
        froilanFarm.coops.add(coop3);
        froilanFarm.coops.add(coop4);

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

        //making fields with croprows
        Field field = new Field();
        froilanFarm.fields.add(field);

        CropRow cropRow1 = new CropRow();
        CropRow cropRow2 = new CropRow();
        CropRow cropRow3 = new CropRow();
        CropRow cropRow4 = new CropRow();
        CropRow cropRow5 = new CropRow();
        field.cropRows.add(cropRow1);
        field.cropRows.add(cropRow2);
        field.cropRows.add(cropRow3);
        field.cropRows.add(cropRow4);
        field.cropRows.add(cropRow5);

        //makes veggie plants
          TomatoPlant tomatoplant = new TomatoPlant();
          CornStalk cornStalk = new CornStalk();
          CucumberPlant cucumberPlant = new CucumberPlant();
          GreenBeanPlant greenBeanPlant = new GreenBeanPlant();
          CarrotPlant carrotPlant = new CarrotPlant();

          cropRow1.crops.add(tomatoplant);
          cropRow2.crops.add(cornStalk);
          cropRow3.crops.add(cucumberPlant);
          cropRow4.crops.add(greenBeanPlant);
          cropRow5.crops.add(carrotPlant);

    }
}
///Users/julianajones/IdeaProjects/FroilanFarmsJJM/src/test/java/farm