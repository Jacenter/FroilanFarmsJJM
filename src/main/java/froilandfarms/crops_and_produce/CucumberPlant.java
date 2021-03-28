package froilandfarms.crops_and_produce;


import froilandfarms.interfaces.IProduce;

public class CucumberPlant extends Cucumber implements IProduce {

    @Override
    public void harvest() {
        System.out.println("You harvested some cucumbers.");
    }
}
