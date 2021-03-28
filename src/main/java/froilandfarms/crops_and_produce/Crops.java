package froilandfarms.crops_and_produce;

import froilandfarms.interfaces.IProduce;

public abstract class Crops implements IProduce {


    public Crops() {
    }

    @Override
    public boolean hasBeenFertilized() {
        return false;
    }


    @Override
    public void yield(IProduce object) {

    }

    @Override
    public void yield(EdibleEgg obj) {

    }

    public boolean fertilize() {
        boolean b = Crops.hasBeenFertilized(true);
        return b;
    }

    private static boolean hasBeenFertilized(boolean b) {
        return b;
    }

    public abstract void yield(Crops obj);
}
