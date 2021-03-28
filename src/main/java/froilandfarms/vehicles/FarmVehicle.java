package froilandfarms.vehicles;

import froilandfarms.crops_and_produce.Crops;
import froilandfarms.farm.CropRow;

public abstract class FarmVehicle extends Vehicle {

    public abstract void operate(Crops crop);

    @Override
    public void makeNoise() {

    }

    public boolean isRideable() {
        return true;
    }

    abstract void operate(CropRow crop);
}
