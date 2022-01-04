package app.virtualtropicalforestapplication;

public class Swing implements MoveBehavior{

    @Override
    public void move(String animal) {
        System.out.println(animal+" is swinging");
    }
}
