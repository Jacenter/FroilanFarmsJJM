package froilandfarms.animals;

import froilandfarms.interfaces.IProduce;
import froilandfarms.interfaces.IRideable;

public class Horse extends Animal implements IRideable {

    @Override
    public void makeNoise() {
        System.out.println("The Horse says maybe she's barn with it maybe it's \"Neightbalene\"");
    }

    @Override
    public void eat(IProduce obj) {
        System.out.println("This Horse eats the " + obj.getClass().getSimpleName());

    }

    @Override
    public boolean isRideable() {
        return true;
    }
}
