package froilandfarms;

public class EdibleEgg implements IProduce{

    @Override
    public void harvest() {

    }

    @Override
    public void yield(IProduce produce) {
        System.out.println("you made a new edible egg");
    }

    @Override
    public void yield(EdibleEgg obj) {

    }
}
