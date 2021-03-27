package froilanfarms;

public class Tractor implements INoiseMaker{


    @Override
    public void makeNoise() {
        System.out.println("Tractor Sounds");
    }
}
