package froilandfarms;

public interface IProduce {

     default boolean hasBeenFertilized() {
         return false;
     }

    void harvest();

    void yield();
}
