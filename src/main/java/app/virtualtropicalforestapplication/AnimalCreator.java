package app.virtualtropicalforestapplication;

public abstract class AnimalCreator {
    public Animal chooseAnimal(String chosenAnimal) {
        Animal animal;

        animal = createAnimal(chosenAnimal);

        return animal;
    }

    abstract Animal createAnimal(String chosenAnimal);

}
