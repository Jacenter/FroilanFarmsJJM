package froilandfarms.vehicles;

import froilandfarms.crops_and_produce.Crops;
import froilandfarms.farm.CropRow;

public class Tractor extends FarmVehicle {


    @Override
    public void operate(Crops crop) {

    }

    @Override
    public void makeNoise() {
        System.out.println("Tractor go brrrrrrr. Tractor go vroom.");
    }

    @Override
    void operate(CropRow crop) {


    }
}
