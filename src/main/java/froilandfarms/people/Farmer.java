package froilandfarms.people;

import froilandfarms.interfaces.*;
import froilandfarms.people.Person;

//Farmer extends Person & should impliment Eater , Rider , Botanist
public class Farmer extends Person implements IEater, IRider, IBotanist {

    public Farmer(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void plant() {
        System.out.println(name + " has planted some crops in the cropfield.");
    }

    @Override
    public void eat(IProduce obj) {
        System.out.println(name + " eats the " + obj.getClass().getSimpleName());
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " says ard' bet.'");
    }


    @Override
    public void mount(IRideable object) {
        System.out.println(name + " has mounted the " + object.getClass().getSimpleName());
    }

    @Override
    public void dismount(IRideable object) {
        System.out.println(name + " has dismounted the " + object.getClass().getSimpleName());
    }

    }



