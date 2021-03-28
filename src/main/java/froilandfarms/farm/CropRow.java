package froilandfarms.farm;

import froilandfarms.crops_and_produce.Crops;
import froilandfarms.crops_and_produce.EdibleEgg;
import froilandfarms.interfaces.IProduce;

import java.util.ArrayList;

public class CropRow implements IProduce {
    public ArrayList<Crops> crops;

    public void CropRow() {
        crops = new ArrayList<Crops>();
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

    public boolean fertilize(IProduce obj) {
        obj.hasBeenFertilized();
        return true;
    }
}
