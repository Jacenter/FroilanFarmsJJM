package froilandfarms;

public class Main {

    public static void main(String[] args) {
        Farmer farmer1 = new Farmer("Froilan");
        Horse horse1 = new Horse();
        Tractor FroilansTractor = new Tractor();
        Chicken CharlesTheChicken = new Chicken();
        CropDuster FroilandasCropDuster = new CropDuster();
        Crops Beans = new Crops();
        Pilot Froilanda = new Pilot("Froilanda");
        EdibleEgg edibleEgg = new EdibleEgg();

        farmer1.mount(horse1);
        farmer1.dismount(horse1);
        farmer1.plant();
        farmer1.eat(CharlesTheChicken);
        farmer1.makeNoise();
        horse1.makeNoise();
        horse1.eat(CharlesTheChicken);
        FroilandasCropDuster.operate(Beans);
        Beans.hasBeenFertilized();
        Froilanda.flyVehicle(FroilandasCropDuster);
        Froilanda.eat(CharlesTheChicken);
        CharlesTheChicken.yield(edibleEgg);

    }
}

