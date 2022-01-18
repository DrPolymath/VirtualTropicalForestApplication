package app.virtualtropicalforestapplication;

public class StartDay implements State{
    public Context context;

    public StartDay(Context context) {
        this.context = context;
    }
    
    @Override
    public void change(Context context) {
        System.out.println("Forest at day.");
        context.setState(this);
    }
}
