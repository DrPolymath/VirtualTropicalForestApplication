package app.virtualtropicalforestapplication;

public class Context {
    public State day;
    public State night;
    public State state;

    public Context(State state){
        day = new StartDay(this);
        night = new StartNight(this);
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
