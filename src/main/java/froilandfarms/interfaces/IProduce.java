package froilandfarms.interfaces;

import froilandfarms.crops_and_produce.EdibleEgg;

public interface IProduce {

     default boolean hasBeenFertilized() {
         return false;
     }

    void harvest();

    void yield(IProduce object);

    void yield(EdibleEgg obj);
}
