package froilandfarms.animals;

import froilandfarms.interfaces.IEater;
import froilandfarms.interfaces.INoiseMaker;

public abstract class Animal implements IEater, INoiseMaker {

    @Override
    public void makeNoise() {

    }
}
