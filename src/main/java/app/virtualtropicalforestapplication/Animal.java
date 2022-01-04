package app.virtualtropicalforestapplication;

public abstract class Animal {
    String name;
    MoveBehavior moveBehavior;

    public void setMoveBehavior(MoveBehavior mb){
        moveBehavior = mb;
    }

    public void performMove(String animal){
        moveBehavior.move(animal);
    }

    void display() {
        System.out.println("A " + name + " is created.");
    }
}
