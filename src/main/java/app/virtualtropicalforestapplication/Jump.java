package app.virtualtropicalforestapplication;

public class Jump implements MoveBehavior{

    @Override
    public void move(String animal) {
        System.out.println(animal+" is jumping");
    }
}
