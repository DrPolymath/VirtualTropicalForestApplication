package app.virtualtropicalforestapplication;

public class StartNight implements State{
    public Context context;

    public StartNight(Context context) {
        this.context = context;
    }
    
    @Override
    public void change() {
        System.out.println("Forest at night.");
        context.setState(this);
    }
}
