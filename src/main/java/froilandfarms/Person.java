package froilandfarms;

//Person will implements NoiseMaker & can eat edible objects
public abstract class Person implements INoiseMaker, IEater {
    public String name;

    public Person(String name) {
    }

    public abstract void mount(IRideable object);
}
