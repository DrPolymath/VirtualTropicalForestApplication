package app.virtualtropicalforestapplication;

public class StartDay implements State{
    @Override
    public void change(Context context) {
        System.out.println("Forest at day.");
        context.setState(this);
    }
}
