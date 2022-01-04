package app.virtualtropicalforestapplication;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ImageView IVCrocodile;

    @FXML
    private ImageView IVDuck;

    @FXML
    private ImageView IVEagle;

    @FXML
    private ImageView IVForest;

    @FXML
    private ImageView IVFrog;

    @FXML
    private ImageView IVMonkey;

    @FXML
    private ImageView IVOwl;

    @FXML
    private ImageView IVSnake;

    @FXML
    private ImageView IVSquirrel;

    @FXML
    private ImageView IVTiger;

    @FXML
    private ImageView IVWolf;

    @FXML
    private ImageView FrogSwim;

    @FXML
    private ImageView SnakeSwim;

    @FXML
    private ImageView CrocodileSwim;

    @FXML
    private ImageView DuckWalk;

    @FXML
    private ImageView SquirrelWalk;

    @FXML
    private ImageView SquirrelFly;

    @FXML
    private ImageView WolfWalk;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/forest.jpg");
        String localUrl = null;

        try {
            localUrl = file.toURI().toURL().toString();
            Image image = new Image(localUrl);
            IVForest.setImage(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void onCreateAnimals(ActionEvent event) throws MalformedURLException {
        AnimalCreator mammals = new Mammals();
        AnimalCreator amphibians = new Amphibians();
        AnimalCreator birds = new Birds();
        AnimalCreator reptiles= new Reptiles();

        String localUrl = null;
        File file = null;
        Image image = null;

        // Create tiger
        Animal tiger = mammals.chooseAnimal("tiger");
        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/tiger.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVTiger.setImage(image);
        tiger.display();
        // Create wolf
        Animal wolf = mammals.chooseAnimal("wolf");
        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/wolf.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVWolf.setImage(image);
        wolf.display();
        // Create eagle
        Animal eagle = birds.chooseAnimal("eagle");
        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/eagle.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVEagle.setImage(image);
        eagle.display();
        // Create frog
        Animal frog = amphibians.chooseAnimal("frog");
        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/frog.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVFrog.setImage(image);
        frog.display();
        // Create snake
        Animal snake = reptiles.chooseAnimal("snake");
        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/snake.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVSnake.setImage(image);
        snake.display();
        // Create monkey
        Animal monkey = mammals.chooseAnimal("monkey");
        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/monkey.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVMonkey.setImage(image);
        monkey.display();
        // Create squirrel
        Animal squirrel = mammals.chooseAnimal("squirrel");
        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/squirrel.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVSquirrel.setImage(image);
        squirrel.display();
        // Create duck
        Animal duck = birds.chooseAnimal("duck");
        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/duck.png");
        //file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/duck.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVDuck.setImage(image);
        duck.display();
        // Create crocodile
        Animal crocodile = reptiles.chooseAnimal("crocodile");
        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/crocodile.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVCrocodile.setImage(image);
        crocodile.display();
        // Create owl
        Animal owl = birds.chooseAnimal("owl");
        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/owl.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVOwl.setImage(image);
        owl.display();

    }

    @FXML
    void onCrocodileSwim(ActionEvent event) throws MalformedURLException{

        AnimalCreator reptiles = new Reptiles();

        String localUrl = null;
        File file = null;
        Image image = null;

        Animal crocodile = reptiles.chooseAnimal("crocodile");
        crocodile.setMoveBehavior(new Swim());
        crocodile.performMove("Crocodile");

        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/crocodile-swimming.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVCrocodile.setImage(null);
        CrocodileSwim.setImage(image);
    }

    @FXML
    void onCrocodileWalk(ActionEvent event) throws MalformedURLException{

        AnimalCreator reptiles = new Reptiles();

        String localUrl = null;
        File file = null;
        Image image = null;

        Animal crocodile = reptiles.chooseAnimal("crocodile");
        crocodile.setMoveBehavior(new Walk());
        crocodile.performMove("Crocodile");

        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/crocodile-walking.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        CrocodileSwim.setImage(null);
        IVCrocodile.setImage(image);
    }

    @FXML
    void onDuckSwim(ActionEvent event) throws MalformedURLException{

        AnimalCreator birds = new Birds();

        String localUrl = null;
        File file = null;
        Image image = null;

        Animal duck = birds.chooseAnimal("duck");
        duck.setMoveBehavior(new Swim());
        duck.performMove("Duck");

        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/duck-swimming.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        DuckWalk.setImage(null);
        IVDuck.setImage(image);

    }

    @FXML
    void onDuckWalk(ActionEvent event) throws MalformedURLException{

        AnimalCreator birds = new Birds();

        String localUrl = null;
        File file = null;
        Image image = null;

        Animal duck = birds.chooseAnimal("duck");
        duck.setMoveBehavior(new Walk());
        duck.performMove("Duck");

        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/duck-walking.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVDuck.setImage(null);
        DuckWalk.setImage(image);

    }

    @FXML
    void onEagleFly(ActionEvent event) throws MalformedURLException{

        AnimalCreator birds = new Birds();

        String localUrl = null;
        File file = null;
        Image image = null;

        Animal eagle = birds.chooseAnimal("eagle");
        eagle.setMoveBehavior(new Fly());
        eagle.performMove("Eagle");

        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/eagle-flying.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVEagle.setImage(image);
//        TranslateTransition translate = new TranslateTransition();
//        translate.setNode(IVEagle);
//        translate.setDuration(Duration.millis(1000));
//        translate.setCycleCount(TranslateTransition.INDEFINITE);
//        translate.setByX(250);
//        translate.play();

//        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/eagle-flying2.gif");
//        localUrl = file.toURI().toURL().toString();
//        image = new Image(localUrl);
//        IVEagle.setImage(image);
//        translate.setNode(IVEagle);
//        translate.setDuration(Duration.millis(1000));
//        translate.setCycleCount(TranslateTransition.INDEFINITE);
//        translate.setByX(-250);
//        translate.play();
//        translate.setByY(-250);
//        translate.setAutoReverse(true);

    }

    @FXML
    void onFrogJump(ActionEvent event) throws MalformedURLException{

        AnimalCreator amphibians = new Amphibians();

        String localUrl = null;
        File file = null;
        Image image = null;

        Animal frog = amphibians.chooseAnimal("frog");
        frog.setMoveBehavior(new Jump());
        frog.performMove("Frog");

        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/frog-jumping.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        FrogSwim.setImage(null);
        IVFrog.setImage(image);
    }

    @FXML
    void onFrogSwim(ActionEvent event) throws MalformedURLException{

        AnimalCreator amphibians = new Amphibians();

        String localUrl = null;
        File file = null;
        Image image = null;

        Animal frog = amphibians.chooseAnimal("frog");
        frog.setMoveBehavior(new Swim());
        frog.performMove("Frog");
        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/frog-swimming.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVFrog.setImage(null);
        FrogSwim.setImage(image);
    }

    @FXML
    void onMonkeySwing(ActionEvent event) throws MalformedURLException{

        AnimalCreator mammals = new Mammals();

        String localUrl = null;
        File file = null;
        Image image = null;

        Animal monkey = mammals.chooseAnimal("monkey");
        monkey.setMoveBehavior(new Swing());
        monkey.performMove("Monkey");

        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/monkey-swinging.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVMonkey.setImage(image);
    }

    @FXML
    void onOwlFly(ActionEvent event) throws MalformedURLException{

        AnimalCreator birds = new Birds();

        String localUrl = null;
        File file = null;
        Image image = null;

        Animal owl = birds.chooseAnimal("owl");
        owl.setMoveBehavior(new Fly());
        owl.performMove("Owl");

        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/owl-flying.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVOwl.setImage(image);
    }

    @FXML
    void onSnakeCrawl(ActionEvent event) throws MalformedURLException{

        AnimalCreator reptiles = new Reptiles();

        String localUrl = null;
        File file = null;
        Image image = null;

        Animal snake = reptiles.chooseAnimal("snake");
        snake.setMoveBehavior(new Crawl());
        snake.performMove("Snake");

        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/snake-crawling.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVSnake.setImage(image);
    }

    @FXML
    void onSnakeSwim(ActionEvent event) throws MalformedURLException{

        AnimalCreator reptiles = new Reptiles();

        String localUrl = null;
        File file = null;
        Image image = null;

        Animal snake = reptiles.chooseAnimal("snake");
        snake.setMoveBehavior(new Swim());
        snake.performMove("Snake");

        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/snake-swimming.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVSnake.setImage(null);
        SnakeSwim.setImage(image);
    }

    @FXML
    void onSquirrelFly(ActionEvent event) throws MalformedURLException{

        AnimalCreator mammals = new Mammals();

        String localUrl = null;
        File file = null;
        Image image = null;

        Animal squirrel = mammals.chooseAnimal("squirrel");
        squirrel.setMoveBehavior(new Fly());
        squirrel.performMove("Squirrel");

        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/squirrel-flying.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        SquirrelWalk.setImage(null);
        IVSquirrel.setImage(null);
        SquirrelFly.setImage(image);
    }

    @FXML
    void onSquirrelWalk(ActionEvent event) throws MalformedURLException{

        AnimalCreator mammals = new Mammals();

        String localUrl = null;
        File file = null;
        Image image = null;

        Animal squirrel = mammals.chooseAnimal("squirrel");
        squirrel.setMoveBehavior(new Walk());
        squirrel.performMove("Squirrel");

        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/squirrel-walking.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVSquirrel.setImage(null);
        SquirrelFly.setImage(null);
        SquirrelWalk.setImage(image);
    }

    @FXML
    void onTigerWalk(ActionEvent event) throws MalformedURLException{

        AnimalCreator mammals = new Mammals();

        String localUrl = null;
        File file = null;
        Image image = null;

        Animal tiger = mammals.chooseAnimal("tiger");
        tiger.setMoveBehavior(new Walk());
        tiger.performMove("Tiger");

        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/tiger-walking.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVTiger.setImage(image);
    }

    @FXML
    void onWolfWalk(ActionEvent event) throws MalformedURLException{

        AnimalCreator mammals = new Mammals();

        String localUrl = null;
        File file = null;
        Image image = null;

        Animal wolf = mammals.chooseAnimal("wolf");
        wolf.setMoveBehavior(new Walk());
        wolf.performMove("Wolf");

        file = new File("D:/Education/DesignPatterns/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/wolf-walking.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVWolf.setImage(null);
        WolfWalk.setImage(image);

    }
}