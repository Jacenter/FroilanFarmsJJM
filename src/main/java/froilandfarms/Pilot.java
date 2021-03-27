package froilandfarms;

public class Pilot extends Person implements IRider{

    public Pilot (String name) {
        super (name);
    }
    

    @Override
    public void mount(IRideable object) {
        System.out.println("pilot" + " has mounted the " + object.getClass().getSimpleName());
    }

    @Override
    public void dismount(IRideable object) {
        System.out.println("pilot" + " has dismounted the " + object.getClass().getSimpleName());
    }


    @Override
    public void makeNoise() {
        System.out.println("pilot" + " said : I'm your sister Froilan that's inappropriate.");
    }

    @Override
    public void eat(IProduce obj) {
        System.out.println("The pilot eats some " + obj.getClass().getSimpleName());

    }

    public void flyVehicle(IAircraft obj) {
        System.out.println(name + " is flying the " + obj.getClass().getSimpleName());
    }
}
