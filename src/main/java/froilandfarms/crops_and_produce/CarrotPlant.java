package froilandfarms.crops_and_produce;

import froilandfarms.crops_and_produce.Crops;
import froilandfarms.interfaces.IProduce;

public class CarrotPlant extends Carrot implements IProduce {

    @Override
    public void harvest() {
        System.out.println("You harvested some carrot plants.");
    }
}
