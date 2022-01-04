package app.virtualtropicalforestapplication;

public class Mammals extends AnimalCreator{
    @Override
    Animal createAnimal(String chosenAnimal) {
        if(chosenAnimal=="wolf") {
            return new Wolf();
        } else if(chosenAnimal=="tiger") {
            return new Tiger();
        } else if(chosenAnimal=="monkey") {
            return new Monkey();
        } else if(chosenAnimal=="squirrel") {
            return new Squirrel();
        } else {
            return null;
        }
    }
}
