package froilandfarms.crops_and_produce;

import froilandfarms.interfaces.IProduce;

public class TomatoPlant extends Tomato implements IProduce {
    @Override
    public void harvest() {
        System.out.println("You harvested some tomato plants");
    }
}
