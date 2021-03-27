package froilandfarms;

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
    public void yield() {
        double yield;
        if (hasBeenFertilized() == false) {
            yield = Math.random() * 10 + 1;
            System.out.println(" This chicken produced " + yield + " Edible Eggs.");
        }
    }

    @Override
    public void eat(IProduce obj) {
        System.out.println("the chicken eats" + obj.getClass().getSimpleName());

    }
}
