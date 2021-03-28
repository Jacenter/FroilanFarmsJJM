package froilandfarms.crops_and_produce;

import froilandfarms.interfaces.IProduce;

public class CornStalk extends Corn implements IProduce {

    @Override
    public void harvest() {
        System.out.println("You harvested some ears of corn.");
    }
}