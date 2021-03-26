package vehicles;

public class Tractor extends FarmVehicle {
    public Tractor(boolean operate) {
        super(operate);
    }

    public void harvest(Crop crop){
        System.out.println("You have harvested a Crop");
    }
}
