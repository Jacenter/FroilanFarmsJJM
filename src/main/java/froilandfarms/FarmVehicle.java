package froilandfarms;

public abstract class FarmVehicle extends Vehicle{

    @Override
    public void makeNoise() {

    }

    public boolean isRideable() {
        return true;
    }

     abstract void operate(Crops crop);
}
