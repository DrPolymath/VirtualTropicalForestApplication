package app.virtualtropicalforestapplication;

public class Amphibians extends AnimalCreator{
    @Override
    Animal createAnimal(String chosenAnimal) {
        if(chosenAnimal=="frog"){
            return new Frog();
        } else {
            return null;
        }
    }
}
