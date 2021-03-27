package froilanfarms;

public class Chicken extends Animal implements IProduce{





    @Override
    public void hasBeenFertilized() {
    }

    @Override
    public void harvest(){
        double yield = Math.random() * 10 +1;
        System.out.println("Your harvest yields: " + yield + "eggs");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bawk Bawk");
    }
}
