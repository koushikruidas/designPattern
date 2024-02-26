package Pattern.Behavioral.ResolvingFactoryIssue;

import Pattern.Creational.Factory.SpeciesType;

public class Main {
    public static void main(String[] args) {
        // We use Strategy pattern to remove the if-else statement.

        AnimalFactory carnivoresFactory = new AnimalFactory(new CarnivoresCreationStrategy());
        Animal carnivore = carnivoresFactory.createAnimal(SpeciesType.LION);
        carnivore.eat();
        carnivore.numberOfLegs();
        carnivore.type(); // This will work

        AnimalFactory herbivoresFactory = new AnimalFactory(new HerbivoresCreationStrategy());
        Animal herbivore = herbivoresFactory.createAnimal(SpeciesType.COW);
        herbivore.eat();
        herbivore.numberOfLegs();
        herbivore.type(); // This will work
    }
}
