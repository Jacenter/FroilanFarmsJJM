package froilandfarms.animals;

import froilandfarms.crops_and_produce.EdibleEgg;
import froilandfarms.interfaces.IProduce;

public class Chicken extends Animal implements IProduce {

    @Override
    public void makeNoise() {
        System.out.println("Bawk Bawk");
    }


    public boolean hasBeenFertilized() {
        return false;
    }

    @Override
    public void harvest() {
        double yield = Math.random() * 10 + 1;
        System.out.println("You harvested " + yield + " eggs.");
    }

    @Override
    public void yield(IProduce object) {

    }

    @Override
    public void eat(IProduce obj) {
        System.out.println("the chicken eats" + obj.getClass().getSimpleName());
    }

    @Override
    public void yield(EdibleEgg obj) {
        int e = (int) (Math.random()* 10 + 1);
        if (obj.hasBeenFertilized() == false) {
            if (e == 1) {
            System.out.println(e + "new EdibleEgg has been yielded");
        }
            else if (e != 1) {
                System.out.println(e + " new EdibleEggs have been yielded");
            }
    }

    }
}
