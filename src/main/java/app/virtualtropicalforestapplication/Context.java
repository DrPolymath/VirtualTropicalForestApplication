package app.virtualtropicalforestapplication;

public class Context {
    public State state;

    public Context() {
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
