package froilandfarms.farm;

import froilandfarms.vehicles.Vehicle;

import java.util.ArrayList;

public class Farm {

    public ArrayList<Stable> stables = new ArrayList<Stable>();
    public ArrayList<ChickenCoop> coops = new ArrayList<ChickenCoop>();
    public FarmHouse farmHouse = new FarmHouse();
    public ArrayList<Field> field = new ArrayList<Field>();
    public ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
}
