package froilanfarms;

public class CornStalk extends Crops {



    @Override
    public void harvest(){
        double yield = Math.random() * 10 + 1;
        System.out.println("Your harvest yields: " + yield + "ears of corn");

    }






}
