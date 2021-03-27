package froilanfarms;

public class TomatoPlant extends Crops{



    @Override
    public void harvest(){
        double yield = Math.random() * 10 + 1;
        System.out.println("Your harvest yields: " + yield + "tomatoes");

    }
}
