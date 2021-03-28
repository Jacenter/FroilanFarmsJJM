package froilandfarms.vehicles;

import froilandfarms.crops_and_produce.Crops;
import froilandfarms.farm.CropRow;
import froilandfarms.interfaces.IAircraft;

public class CropDuster extends FarmVehicle implements IAircraft {

    @Override
    public void operate(Crops crop) {
        if (crop.hasBeenFertilized() == false) {
            System.out.println("The CropDuster is Fertilizing the crops");
            crop.hasBeenFertilized();
            System.out.println(crop.fertilize());
        }
    }

    @Override
    public void fly(FarmVehicle obj) {
        System.out.println(obj.getClass().getSimpleName() + " is flying high in the sky");

    }

    @Override
    public void makeNoise() {
        System.out.println("CropDuster go brrrr.");
    }

    @Override
    void operate(CropRow crop) {

    }
}

