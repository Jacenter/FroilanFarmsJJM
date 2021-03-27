package froilandfarms;

public class Tractor extends FarmVehicle {


    @Override
    public void makeNoise() {
        System.out.println("Tractor go brrrrrrr. Tractor go vroom.");
    }

    @Override
    void operate(Crops crop) {


    }
}
