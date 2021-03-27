package froilanfarms;

public class Horse extends Animal implements IRideable{

    @Override
    public void makeNoise() {
        System.out.println("Neeyyyyyyy");
    }

    @Override
    public void eat() {

    }

    @Override
    public boolean isRideable() {
        return true;
    }
}
