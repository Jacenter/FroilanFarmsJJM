package froilandfarms;

//Farmer extends Person & should impliment Eater , Rider , Botanist
public class Farmer extends Person implements IEater, IRider, IBotanist{
    public Farmer(String name) {
        super(name);
    }

    @Override
    public void plant() {
        System.out.println("The Farmer has planted some crops in the cropfield");
    }

    @Override
    public void eat(IProduce obj) {
        System.out.println("The Farmer eats the " + obj.getClass().getSimpleName());
    }

    @Override
    public void makeNoise() {
        System.out.println("The farmer says ard' bet'");
    }


    @Override
    public void mount(IRideable object) {
        System.out.println("The Farmer has mounted the " + object.getClass().getSimpleName());
    }

    @Override
    public void dismount(IRideable object) {
        System.out.println("The Farmer has dismounted the " + object.getClass().getSimpleName());
    }

    }



