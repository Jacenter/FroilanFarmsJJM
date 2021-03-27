package froilandfarms;

public class CropDuster extends FarmVehicle implements IAircraft {

    @Override
    void operate(Crops crop) {
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
}

