package app.virtualtropicalforestapplication;

public class StartNight implements State{
    @Override
    public void change(Context context) {
        System.out.println("Forest at night.");
        context.setState(this);
    }
}
