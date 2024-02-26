package Pattern.Behavioral.ResolvingFactoryIssue;

import Pattern.Creational.Factory.SpeciesType;

// Strategy interface for creating Animal instances
public interface AnimalCreationStrategy {
    Animal createAnimal(SpeciesType speciesType);
}
