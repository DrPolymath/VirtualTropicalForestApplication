package app.virtualtropicalforestapplication;

public class Reptiles extends AnimalCreator{
    @Override
    Animal createAnimal(String chosenAnimal) {
        if(chosenAnimal=="snake") {
            return new Snake();
        } else if (chosenAnimal=="crocodile") {
            return new Crocodile();
        } else {
            return null;
        }
    }
}
