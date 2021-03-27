package froilandfarms;

public class Main {

    public static void main(String[] args) {
        Farmer fuckboi = new Farmer("Josh");
        Horse lightning = new Horse();
        Tractor tman = new Tractor();
        Chicken HarveyWeinstein = new Chicken();
        CropDuster cd = new CropDuster();
        Crops mushrooms = new Crops();
        Pilot gurl = new Pilot("Froilanda");

        fuckboi.mount(lightning);
        fuckboi.mount(tman);
        fuckboi.dismount(lightning);
        fuckboi.plant();
        fuckboi.eat(HarveyWeinstein);
        fuckboi.makeNoise();
        lightning.makeNoise();
        lightning.eat(HarveyWeinstein);
        cd.operate(mushrooms);
        mushrooms.hasBeenFertilized();
        gurl.flyVehicle(cd);

    }
}

