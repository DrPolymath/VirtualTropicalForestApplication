package app.virtualtropicalforestapplication;

public class Stop implements MoveBehavior{

    public void move(String animal) {
        System.out.println(animal+" is stop moving");
    }
}
