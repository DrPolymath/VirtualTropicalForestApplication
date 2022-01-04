package app.virtualtropicalforestapplication;

public class Crawl implements MoveBehavior{

    @Override
    public void move(String animal) {
        System.out.println(animal+" is crawling");
    }
}
