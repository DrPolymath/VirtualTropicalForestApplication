package app.virtualtropicalforestapplication;

public class Birds extends AnimalCreator{

    @Override
    Animal createAnimal(String chosenAnimal) {
        if(chosenAnimal=="eagle") {
            return new Eagle();
        } else if(chosenAnimal=="owl") {
            return new Owl();
        } else if(chosenAnimal=="duck") {
            return new Duck();
        } else {
            return null;
        }
    }

}
