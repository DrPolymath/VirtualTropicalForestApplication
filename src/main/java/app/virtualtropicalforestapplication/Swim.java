package app.virtualtropicalforestapplication;

public class Swim implements MoveBehavior{

    @Override
    public void move(String animal) {
        System.out.println(animal+" is swimming");
    }
}
