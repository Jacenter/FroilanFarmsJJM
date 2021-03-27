package froilandfarms;

public abstract class Vehicle implements IRideable, INoiseMaker{

    @Override
    public void makeNoise() {

    }

    @Override
    public boolean isRideable() {
        return true;
    }

}
