package froilandfarms;

public  class Crops implements IProduce{


    @Override
    public boolean hasBeenFertilized() {
        return false;
    }

    @Override
    public void harvest() {

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
}
