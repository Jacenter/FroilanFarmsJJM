package froilandfarms.farm;

import froilandfarms.crops_and_produce.Crops;

import java.util.ArrayList;

public class Field extends Farm{
    public ArrayList<Crops> cropRows = new ArrayList<>();

    public void Croprow() {
        cropRows = new ArrayList<>();
    }
}
