package Pattern.Behavioral.ResolvingFactoryIssue;

import Pattern.Creational.Factory.SpeciesType;

// AnimalFactory using the Strategy Pattern
public class AnimalFactory {
    private AnimalCreationStrategy creationStrategy;

    public AnimalFactory(AnimalCreationStrategy creationStrategy) {
        this.creationStrategy = creationStrategy;
    }

    public Animal createAnimal(SpeciesType speciesType) {
        return creationStrategy.createAnimal(speciesType);
    }


}
