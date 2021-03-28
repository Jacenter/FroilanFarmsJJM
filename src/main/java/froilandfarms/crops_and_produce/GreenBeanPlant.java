package froilandfarms.crops_and_produce;


import froilandfarms.interfaces.IProduce;

public class GreenBeanPlant extends GreenBean implements IProduce {

        @Override
        public void harvest() {
            System.out.println("You harvested some green bean plants.");
        }
    }
