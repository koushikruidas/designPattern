package Pattern.Behavioral.ResolvingFactoryIssue;

import Pattern.Creational.Factory.SpeciesType;

// Concrete implementation for Carnivores
public class CarnivoresCreationStrategy implements AnimalCreationStrategy {
    @Override
    public Animal createAnimal(SpeciesType speciesType) {
        switch (speciesType) {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            case LION:
                return new Lion();
            case TIGER:
                return new Tiger();
            default:
                throw new IllegalArgumentException("Invalid SpeciesType for Carnivores");
        }
    }
}
