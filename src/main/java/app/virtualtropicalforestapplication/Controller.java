package app.virtualtropicalforestapplication;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.effect.Lighting;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class Controller implements Initializable {
    
    @FXML
    private ImageView IVRaining;

    @FXML
    private ImageView IVWind1;

    @FXML
    private ImageView IVWind2;

    @FXML
    private ImageView IVWind3;

    @FXML
    private ImageView IVWind4;

    @FXML
    private ImageView IVWind5;

    @FXML
    private ImageView IVLightning1;

    @FXML
    private ImageView IVLightning2;

    @FXML
    private ImageView IVLightning3;

    @FXML
    private ImageView IVLightning4;

    @FXML
    private ImageView IVLightning5;

    @FXML
    private ImageView IVCrocodile;

    @FXML
    private ImageView IVDuck;

    @FXML
    private ImageView IVEagle;

    @FXML
    private ImageView IVForest;
    
    @FXML
    private ImageView IVForestNight;
    
    private State state;
    Context context = new Context(state);

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

    @FXML
    private ImageView DuckSwim;

    @FXML
    private ImageView FrogJump;

    @FXML
    private Button box1;

    @FXML
    private Button box2;

    @FXML
    private Button box3;

    @FXML
    private Button btnCreateAnimals;
    @FXML
    private Button btnChangeDayNight;
    @FXML
    private Button btnCrocodileSwim;
    @FXML
    private Button btnCrocodileWalk;
    @FXML
    private Button btnDuckWalk;
    @FXML
    private Button btnDuckSwim;
    @FXML
    private Button btnEagleFly;
    @FXML
    private Button btnFrogJump;
    @FXML
    private Button btnFrogSwim;
    @FXML
    private Button btnMonkeySwing;
    @FXML
    private Button btnOwlFly;
    @FXML
    private Button btnSnakeCrawl;
    @FXML
    private Button btnSnakeSwim;
    @FXML
    private Button btnSquirrelFly;
    @FXML
    private Button btnSquirrelWalk;
    @FXML
    private Button btnTigerWalk;
    @FXML
    private Button btnWolfWalk;
    @FXML
    private Button btnRaining;
    @FXML
    private Button btnHeavyRaining;
    @FXML
    private Button btnStopRaining;
    @FXML
    private Button btnOwlStop;
    @FXML
    private Button btnSnakeStop;
    @FXML
    private Button btnSquirrelStop;
    @FXML
    private Button btnTigerStop;
    @FXML
    private Button btnWolfStop;
    @FXML
    private Button btnMonkeyStop;
    @FXML
    private Button btnFrogStop;
    @FXML
    private Button btnEagleStop;
    @FXML
    private Button btnDuckStop;
    @FXML
    private Button btnCrocodileStop;

    Weather Raining;
    Weather HeavyRaining;
    String checkRainType;
    AnimalCreator mammals;
    AnimalCreator amphibians;
    AnimalCreator birds;
    AnimalCreator reptiles;
    StartNight startNight;
    Animal tiger;
    Animal wolf;
    Animal eagle;
    Animal frog;
    Animal snake;
    Animal monkey;
    Animal squirrel;
    Animal duck;
    Animal crocodile;
    Animal owl;
    int windyCounter = 0;
    int lightningCounter = 0;

    boolean toSim = false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/forest.jpg");
        String localUrl = null;
        context.day.change();

        try {
            localUrl = file.toURI().toURL().toString();
            Image image = new Image(localUrl);
            IVForest.setImage(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        //weather
        box1.setDisable(true);
        box2.setDisable(true);
        box3.setDisable(true);

        resetButton();
        
        checkRainType="";
        Raining = new Raining();
        HeavyRaining = new HeavyRaining();
        mammals = new Mammals();
        amphibians = new Amphibians();
        birds = new Birds();
        reptiles= new Reptiles();
    }

    void buttonToSim(){
        btnCreateAnimals.setDisable(true);
        btnChangeDayNight.setDisable(true);
        btnCrocodileSwim.setDisable(true);
        btnCrocodileWalk.setDisable(true);
        btnDuckWalk.setDisable(true);
        btnDuckSwim.setDisable(true);
        btnEagleFly.setDisable(true);
        btnFrogJump.setDisable(true);
        btnFrogSwim.setDisable(true);
        btnMonkeySwing.setDisable(true);
        btnOwlFly.setDisable(true);
        btnSnakeCrawl.setDisable(true);
        btnSnakeSwim.setDisable(true);
        btnSquirrelFly.setDisable(true);
        btnSquirrelWalk.setDisable(true);
        btnTigerWalk.setDisable(true);
        btnWolfWalk.setDisable(true);
        btnRaining.setDisable(true);
        btnHeavyRaining.setDisable(true);
        btnStopRaining.setDisable(true);
        btnOwlStop.setDisable(true);
        btnSnakeStop.setDisable(true);
        btnSquirrelStop.setDisable(true);
        btnTigerStop.setDisable(true);
        btnWolfStop.setDisable(true);
        btnMonkeyStop.setDisable(true);
        btnFrogStop.setDisable(true);
        btnEagleStop.setDisable(true);
        btnDuckStop.setDisable(true);
        btnCrocodileStop.setDisable(true);
    }

    @FXML
    void onStartSimulateClick(ActionEvent event) throws InterruptedException {
//        buttonToSim();
        resetButton();

//        CheckBox[] checkBoxArray = {box1,box2,box3};
        Button[] btnArray = {btnCreateAnimals,btnChangeDayNight,btnCrocodileSwim,btnCrocodileWalk,btnDuckWalk,
                btnDuckSwim,btnEagleFly,btnFrogJump,btnFrogSwim,btnMonkeySwing, btnOwlFly, btnSnakeCrawl, btnSnakeSwim,
                btnSquirrelFly, btnSquirrelWalk, btnTigerWalk, btnWolfWalk, btnRaining, btnHeavyRaining, btnStopRaining,
                btnOwlStop, btnSnakeStop, btnSquirrelStop, btnTigerStop, btnWolfStop, btnMonkeyStop, btnFrogStop,
                btnEagleStop, btnDuckStop, btnCrocodileStop};
        int[] holdRandomBtnIndex= new int[9];
        toSim=true;
//        while(toSim){
//            for (int i = 0; i < holdRandomBtnIndex.length; i++) {
//                holdRandomBtnIndex[i] = (int)Math.floor(Math.random()*((btnArray.length-1)-1)+0);
//            }
//            for (int i = 0; i < holdRandomBtnIndex.length; i++) {
//                btnArray[holdRandomBtnIndex[i]].fire();
//                TimeUnit.SECONDS.sleep(1);
//            }
//        }
    }

    @FXML
    void onPauseContinueClick(ActionEvent event) throws MalformedURLException {
        toSim=false;
    }

    void resetButton(){
        if(tiger==null){
            btnCreateAnimals.setDisable((false));
            btnCrocodileSwim.setDisable(true);
            btnCrocodileWalk.setDisable(true);
            btnDuckWalk.setDisable(true);
            btnDuckSwim.setDisable(true);
            btnEagleFly.setDisable(true);
            btnFrogJump.setDisable(true);
            btnFrogSwim.setDisable(true);
            btnMonkeySwing.setDisable(true);
            btnOwlFly.setDisable(true);
            btnSnakeCrawl.setDisable(true);
            btnSnakeSwim.setDisable(true);
            btnSquirrelFly.setDisable(true);
            btnSquirrelWalk.setDisable(true);
            btnTigerWalk.setDisable(true);
            btnWolfWalk.setDisable(true);
            btnOwlStop.setDisable(true);
            btnSnakeStop.setDisable(true);
            btnSquirrelStop.setDisable(true);
            btnTigerStop.setDisable(true);
            btnWolfStop.setDisable(true);
            btnMonkeyStop.setDisable(true);
            btnFrogStop.setDisable(true);
            btnEagleStop.setDisable(true);
            btnDuckStop.setDisable(true);
            btnCrocodileStop.setDisable(true);
        }
        if(tiger!=null){
            btnCrocodileSwim.setDisable(false);
            btnCrocodileWalk.setDisable(false);
            btnDuckWalk.setDisable(false);
            btnDuckSwim.setDisable(false);
            btnEagleFly.setDisable(false);
            btnFrogJump.setDisable(false);
            btnFrogSwim.setDisable(false);
            btnMonkeySwing.setDisable(false);
            btnOwlFly.setDisable(false);
            btnSnakeCrawl.setDisable(false);
            btnSnakeSwim.setDisable(false);
            btnSquirrelFly.setDisable(false);
            btnSquirrelWalk.setDisable(false);
            btnTigerWalk.setDisable(false);
            btnWolfWalk.setDisable(false);
            btnOwlStop.setDisable(false);
            btnSnakeStop.setDisable(false);
            btnSquirrelStop.setDisable(false);
            btnTigerStop.setDisable(false);
            btnWolfStop.setDisable(false);
            btnMonkeyStop.setDisable(false);
            btnFrogStop.setDisable(false);
            btnEagleStop.setDisable(false);
            btnDuckStop.setDisable(false);
            btnCrocodileStop.setDisable(false);
        }
        btnChangeDayNight.setDisable(false);
        btnRaining.setDisable(false);
        btnHeavyRaining.setDisable(false);
        btnStopRaining.setDisable(false);
    }

    @FXML
    void onCreateAnimals(ActionEvent event) throws MalformedURLException {

        String localUrl = null;
        File file = null;
        Image image = null;

        // Create tiger
        tiger = mammals.chooseAnimal("tiger");
        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/tiger.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVTiger.setImage(image);
        tiger.display();
        // Create wolf
        wolf = mammals.chooseAnimal("wolf");
        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/wolf.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVWolf.setImage(image);
        wolf.display();
        // Create eagle
        eagle = birds.chooseAnimal("eagle");
        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/eagle.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVEagle.setImage(image);
        eagle.display();
        // Create frog
        frog = amphibians.chooseAnimal("frog");
        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/frog.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVFrog.setImage(image);
        frog.display();
        // Create snake
        snake = reptiles.chooseAnimal("snake");
        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/snake.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVSnake.setImage(image);
        snake.display();
        // Create monkey
        monkey = mammals.chooseAnimal("monkey");
        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/monkey.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVMonkey.setImage(image);
        monkey.display();
        // Create squirrel
        squirrel = mammals.chooseAnimal("squirrel");
        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/squirrel.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVSquirrel.setImage(image);
        squirrel.display();
        // Create duck
        duck = birds.chooseAnimal("duck");
        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/duck.png");
        //file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master-master/src/main/java/app/virtualtropicalforestapplication/images/duck.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVDuck.setImage(image);
        duck.display();
        // Create crocodile
        crocodile = reptiles.chooseAnimal("crocodile");
        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/crocodile.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVCrocodile.setImage(image);
        crocodile.display();
        // Create owl
        owl = birds.chooseAnimal("owl");
        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/owl.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVOwl.setImage(image);
        owl.display();

        btnCreateAnimals.setDisable(true);
        resetButton();
    }
    
    @FXML
    void onDayNight(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        if(context.getState().getClass().getSimpleName().equals("StartDay")){
            context.night.change();
            file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/forest-night.jpg");
            localUrl = file.toURI().toURL().toString();
            image = new Image(localUrl);
            IVForest.setImage(null);
            IVForestNight.setImage(image);
        }else if(context.getState().getClass().getSimpleName().equals("StartNight")){
            context.day.change();
            file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/forest.jpg");
            localUrl = file.toURI().toURL().toString();
            image = new Image(localUrl);
            IVForestNight.setImage(null);
            IVForest.setImage(image);
        }
    }
    
    @FXML
    void onRaining(ActionEvent event) throws MalformedURLException{
        checkRainType = "Raining";

        box1.setDisable(false);
        box2.setDisable(false);
        box3.setDisable(false);

        Raining = new Raining();

        windyCounter = 0;
        lightningCounter = 0;

        IVRaining.setImage(null);

        IVWind1.setImage(null);
        IVWind2.setImage(null);
        IVWind3.setImage(null);
        IVWind4.setImage(null);
        IVWind5.setImage(null);

        IVLightning1.setImage(null);
        IVLightning2.setImage(null);
        IVLightning3.setImage(null);
        IVLightning4.setImage(null);
        IVLightning5.setImage(null);


        String localUrl = null;
        File file = null;
        Image image = null;

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/weather/hujan rintik.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVRaining.setImage(image);

        System.out.println(Raining.getDesc());

    }

    @FXML
    void onHeavyRaining(ActionEvent event) throws MalformedURLException{
        checkRainType = "Heavy Raining";

        box1.setDisable(false);
        box2.setDisable(false);
        box3.setDisable(false);

        HeavyRaining = new HeavyRaining();

        windyCounter = 0;
        lightningCounter = 0;

        IVRaining.setImage(null);
        IVWind1.setImage(null);
        IVWind2.setImage(null);
        IVWind3.setImage(null);
        IVWind4.setImage(null);
        IVWind5.setImage(null);

        IVLightning1.setImage(null);
        IVLightning2.setImage(null);
        IVLightning3.setImage(null);
        IVLightning4.setImage(null);
        IVLightning5.setImage(null);


        String localUrl = null;
        File file = null;
        Image image = null;

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/weather/hujan.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVRaining.setImage(image);

        System.out.println(HeavyRaining.getDesc());
    }

    @FXML
    void onWindy(ActionEvent event) throws MalformedURLException{

        if(checkRainType == "Raining"){

            if(windyCounter < 5) {
                Raining = new Windy(Raining);

                String localUrl = null;
                File file = null;
                Image image = null;

                String windFile[] = {"wind1.gif", "wind2.gif", "wind3.gif", "wind4.gif", "wind5.gif"};
                file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/weather/" + windFile[windyCounter]);
                localUrl = file.toURI().toURL().toString();
                image = new Image(localUrl);

                if(windyCounter == 0)
                    IVWind1.setImage(image);
                else if(windyCounter == 1)
                    IVWind2.setImage(image);
                else if(windyCounter == 2)
                    IVWind3.setImage(image);
                else if(windyCounter == 3)
                    IVWind4.setImage(image);
                else if(windyCounter == 4)
                    IVWind5.setImage(image);

                windyCounter++;

                System.out.println(Raining.getDesc());


            }
            else
                System.out.println("It's too windy!");

        }

        else if(checkRainType == "Heavy Raining"){

            if(windyCounter < 5) {
                HeavyRaining = new Windy(HeavyRaining);

                String localUrl = null;
                File file = null;
                Image image = null;

                String windFile[] = {"wind1.gif", "wind2.gif", "wind3.gif", "wind4.gif", "wind5.gif"};
                file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/weather/" + windFile[windyCounter]);
                localUrl = file.toURI().toURL().toString();
                image = new Image(localUrl);

                if(windyCounter == 0)
                    IVWind1.setImage(image);
                else if(windyCounter == 1)
                    IVWind2.setImage(image);
                else if(windyCounter == 2)
                    IVWind3.setImage(image);
                else if(windyCounter == 3)
                    IVWind4.setImage(image);
                else if(windyCounter == 4)
                    IVWind5.setImage(image);

                windyCounter++;

                System.out.println(HeavyRaining.getDesc());


            }
            else
                System.out.println("It's too windy!");

        }

    }

    @FXML
    void onThunder(ActionEvent event) throws MalformedURLException{

        if(checkRainType == "Raining") {

            Raining = new Thunder(Raining);

            String musicFile = "Thunder Sound Effect.mp3";
            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();

            System.out.println(Raining.getDesc());



        }

        else if(checkRainType == "Heavy Raining" ){

            HeavyRaining = new Thunder(HeavyRaining);

            String musicFile = "Thunder Sound Effect.mp3";
            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();

            System.out.println(HeavyRaining.getDesc());



        }
    }

    @FXML
    void onLightning(ActionEvent event) throws MalformedURLException{

        if(checkRainType == "Raining") {

            if(lightningCounter < 5) {
                Raining = new Lightning(Raining);

                String localUrl = null;
                File file = null;
                Image image = null;

                String lightningFile[] = {"lightning1.gif", "lightning2.gif", "lightning3.gif", "lightning4.gif", "lightning5.gif"};
                file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/weather/" + lightningFile[lightningCounter]);
                localUrl = file.toURI().toURL().toString();
                image = new Image(localUrl);

                if(lightningCounter == 0)
                    IVLightning1.setImage(image);
                else if(lightningCounter == 1)
                    IVLightning2.setImage(image);
                else if(lightningCounter == 2)
                    IVLightning3.setImage(image);
                else if(lightningCounter == 3)
                    IVLightning4.setImage(image);
                else if(lightningCounter == 4)
                    IVLightning5.setImage(image);

                lightningCounter++;

                System.out.println(Raining.getDesc());


            }
            else
                System.out.println("There's too much lightning!");

        }

        else if(checkRainType == "Heavy Raining"  ){

            if(lightningCounter < 5) {
                HeavyRaining = new Lightning(HeavyRaining);

                String localUrl = null;
                File file = null;
                Image image = null;

                String lightningFile[] = {"lightning1.gif", "lightning2.gif", "lightning3.gif", "lightning4.gif", "lightning5.gif"};
                file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/weather/" + lightningFile[lightningCounter]);
                localUrl = file.toURI().toURL().toString();
                image = new Image(localUrl);

                if(lightningCounter == 0)
                    IVLightning1.setImage(image);
                else if(lightningCounter == 1)
                    IVLightning2.setImage(image);
                else if(lightningCounter == 2)
                    IVLightning3.setImage(image);
                else if(lightningCounter == 3)
                    IVLightning4.setImage(image);
                else if(lightningCounter == 4)
                    IVLightning5.setImage(image);

                lightningCounter++;

                System.out.println(HeavyRaining.getDesc());


            }
            else
                System.out.println("There's too much lightning!");

        }


    }

    @FXML
    void onStopRaining(ActionEvent event) throws MalformedURLException{
        checkRainType = "";

        box1.setDisable(true);
        box2.setDisable(true);
        box3.setDisable(true);

        windyCounter = 0;
        lightningCounter = 0;

        IVRaining.setImage(null);
        IVWind1.setImage(null);
        IVWind2.setImage(null);
        IVWind3.setImage(null);
        IVWind4.setImage(null);
        IVWind5.setImage(null);

        IVLightning1.setImage(null);
        IVLightning2.setImage(null);
        IVLightning3.setImage(null);
        IVLightning4.setImage(null);
        IVLightning5.setImage(null);

//        box1.setSelected(false);
//        box2.setSelected(false);
//        box3.setSelected(false);

        Raining = new Raining();
        HeavyRaining = new HeavyRaining();

        System.out.println("Stop Raining");
    }

    @FXML
    void onCrocodileSwim(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        crocodile = reptiles.chooseAnimal("crocodile");
        crocodile.setMoveBehavior(new Swim());
        crocodile.performMove("Crocodile");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/crocodile-swimming.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVCrocodile.setImage(null);
        CrocodileSwim.setImage(image);
    }

    @FXML
    void onCrocodileWalk(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        crocodile = reptiles.chooseAnimal("crocodile");
        crocodile.setMoveBehavior(new Walk());
        crocodile.performMove("Crocodile");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/crocodile-walking.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        CrocodileSwim.setImage(null);
        IVCrocodile.setImage(image);
    }

    @FXML
    void onCrocodileStop(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        crocodile = reptiles.chooseAnimal("crocodile");
        crocodile.setMoveBehavior(new Stop());
        crocodile.performMove("Crocodile");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/crocodile.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        CrocodileSwim.setImage(null);
        IVCrocodile.setImage(image);
    }

    @FXML
    void onDuckSwim(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        duck = birds.chooseAnimal("duck");
        duck.setMoveBehavior(new Swim());
        duck.performMove("Duck");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/duck-swimming.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        DuckWalk.setImage(null);
        IVDuck.setImage(null);
        DuckSwim.setImage(image);

    }

    @FXML
    void onDuckStop(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        duck = birds.chooseAnimal("duck");
        duck.setMoveBehavior(new Stop());
        duck.performMove("Duck");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/duck.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        DuckWalk.setImage(null);
        IVDuck.setImage(image);
        DuckSwim.setImage(null);

    }

    @FXML
    void onDuckWalk(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        duck = birds.chooseAnimal("duck");
        duck.setMoveBehavior(new Walk());
        duck.performMove("Duck");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/duck-walking.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVDuck.setImage(null);
        DuckSwim.setImage(null);
        DuckWalk.setImage(image);

    }

    @FXML
    void onEagleFly(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        eagle = birds.chooseAnimal("eagle");
        eagle.setMoveBehavior(new Fly());
        eagle.performMove("Eagle");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/eagle-flying.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVEagle.setImage(image);
//        TranslateTransition translate = new TranslateTransition();
//        translate.setNode(IVEagle);
//        translate.setDuration(Duration.millis(1000));
//        translate.setCycleCount(TranslateTransition.INDEFINITE);
//        translate.setByX(250);
//        translate.play();

//        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master-master/src/main/java/app/virtualtropicalforestapplication/images/movement/eagle-flying2.gif");
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
    void onEagleStop(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        eagle = birds.chooseAnimal("eagle");
        eagle.setMoveBehavior(new Stop());
        eagle.performMove("Eagle");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/eagle.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVEagle.setImage(image);
    }

    @FXML
    void onFrogJump(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        frog = amphibians.chooseAnimal("frog");
        frog.setMoveBehavior(new Jump());
        frog.performMove("Frog");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/frog-jumping.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        FrogSwim.setImage(null);
        IVFrog.setImage(null);
        FrogJump.setImage(image);
    }

    @FXML
    void onFrogSwim(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        frog = amphibians.chooseAnimal("frog");
        frog.setMoveBehavior(new Swim());
        frog.performMove("Frog");
        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/frog-swimming.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVFrog.setImage(null);
        FrogJump.setImage(null);
        FrogSwim.setImage(image);
    }

    @FXML
    void onFrogStop(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        frog = amphibians.chooseAnimal("frog");
        frog.setMoveBehavior(new Stop());
        frog.performMove("Frog");
        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/frog.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVFrog.setImage(image);
        FrogJump.setImage(null);
        FrogSwim.setImage(null);
    }

    @FXML
    void onMonkeySwing(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        monkey = mammals.chooseAnimal("monkey");
        monkey.setMoveBehavior(new Swing());
        monkey.performMove("Monkey");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/monkey-swinging.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVMonkey.setImage(image);
    }

    @FXML
    void onMonkeyStop(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        monkey = mammals.chooseAnimal("monkey");
        monkey.setMoveBehavior(new Stop());
        monkey.performMove("Monkey");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/monkey.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVMonkey.setImage(image);
    }

    @FXML
    void onOwlFly(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        owl = birds.chooseAnimal("owl");
        owl.setMoveBehavior(new Fly());
        owl.performMove("Owl");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/owl-flying.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVOwl.setImage(image);
    }

    @FXML
    void onOwlStop(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        owl = birds.chooseAnimal("owl");
        owl.setMoveBehavior(new Stop());
        owl.performMove("Owl");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/owl.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVOwl.setImage(image);
    }

    @FXML
    void onSnakeCrawl(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        snake = reptiles.chooseAnimal("snake");
        snake.setMoveBehavior(new Crawl());
        snake.performMove("Snake");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/snake-crawling.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        SnakeSwim.setImage(null);
        IVSnake.setImage(image);
    }

    @FXML
    void onSnakeSwim(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        snake = reptiles.chooseAnimal("snake");
        snake.setMoveBehavior(new Swim());
        snake.performMove("Snake");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/snake-swimming.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVSnake.setImage(null);
        SnakeSwim.setImage(image);
    }

    @FXML
    void onSnakeStop(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        snake = reptiles.chooseAnimal("snake");
        snake.setMoveBehavior(new Stop());
        snake.performMove("Snake");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/snake.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVSnake.setImage(image);
        SnakeSwim.setImage(null);
    }

    @FXML
    void onSquirrelFly(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        squirrel = mammals.chooseAnimal("squirrel");
        squirrel.setMoveBehavior(new Fly());
        squirrel.performMove("Squirrel");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/squirrel-flying.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        SquirrelWalk.setImage(null);
        IVSquirrel.setImage(null);
        SquirrelFly.setImage(image);
    }

    @FXML
    void onSquirrelWalk(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        squirrel = mammals.chooseAnimal("squirrel");
        squirrel.setMoveBehavior(new Walk());
        squirrel.performMove("Squirrel");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/squirrel-walking.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVSquirrel.setImage(null);
        SquirrelFly.setImage(null);
        SquirrelWalk.setImage(image);
    }

    @FXML
    void onSquirrelStop(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        squirrel = mammals.chooseAnimal("squirrel");
        squirrel.setMoveBehavior(new Stop());
        squirrel.performMove("Squirrel");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/squirrel.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVSquirrel.setImage(image);
        SquirrelFly.setImage(null);
        SquirrelWalk.setImage(null);
    }

    @FXML
    void onTigerWalk(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        tiger = mammals.chooseAnimal("tiger");
        tiger.setMoveBehavior(new Walk());
        tiger.performMove("Tiger");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/tiger-walking.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVTiger.setImage(image);
    }

    @FXML
    void onTigerStop(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        tiger = mammals.chooseAnimal("tiger");
        tiger.setMoveBehavior(new Stop());
        tiger.performMove("Tiger");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/tiger.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVTiger.setImage(image);
    }

    @FXML
    void onWolfWalk(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        wolf = mammals.chooseAnimal("wolf");
        wolf.setMoveBehavior(new Walk());
        wolf.performMove("Wolf");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/movement/wolf-walking.gif");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVWolf.setImage(null);
        WolfWalk.setImage(image);
    }

    @FXML
    void onWolfStop(ActionEvent event) throws MalformedURLException{
        String localUrl = null;
        File file = null;
        Image image = null;

        wolf = mammals.chooseAnimal("wolf");
        wolf.setMoveBehavior(new Stop());
        wolf.performMove("Wolf");

        file = new File("C:/Users/ILLEGEAR/Desktop/VirtualTropicalForestApplication-master/src/main/java/app/virtualtropicalforestapplication/images/wolf.png");
        localUrl = file.toURI().toURL().toString();
        image = new Image(localUrl);
        IVWolf.setImage(null);
        WolfWalk.setImage(image);
    }
}
