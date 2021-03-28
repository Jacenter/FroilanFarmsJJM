package froilandfarms.crops_and_produce;

import froilandfarms.interfaces.IProduce;

public class GreenBean extends Crops implements IProduce {
    public String color;

    @Override
    public void yield(Crops obj) {
        int plants = (int) (Math.random()* 10 + 1);
        if (obj.hasBeenFertilized() == true) {
            if (plants == 1) {
                System.out.println(plants + " new " + obj.getClass().getSimpleName() + " has been produced.");
            }
            else if (plants != 1) {
                System.out.println(plants + " new " + obj.getClass().getSimpleName() + " have been produced.");
            }

        }
    }

    public GreenBean(String color){
        this.color = color;

    }

    public GreenBean() {

    }

    @Override
    public void harvest() {

    }
}
