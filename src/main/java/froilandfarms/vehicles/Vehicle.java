package froilandfarms.vehicles;

import froilandfarms.interfaces.INoiseMaker;
import froilandfarms.interfaces.IRideable;

public abstract class Vehicle implements IRideable, INoiseMaker {

    @Override
    public void makeNoise() {

    }

    @Override
    public boolean isRideable() {
        return true;
    }

}
