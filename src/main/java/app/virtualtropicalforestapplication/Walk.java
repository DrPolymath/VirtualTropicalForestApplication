package app.virtualtropicalforestapplication;

public class Walk implements MoveBehavior{

    @Override
    public void move(String animal) {
        System.out.println(animal+" is walking");
    }
}
