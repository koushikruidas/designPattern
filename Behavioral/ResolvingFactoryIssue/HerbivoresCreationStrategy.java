package Pattern.Behavioral.ResolvingFactoryIssue;

import Pattern.Creational.Factory.SpeciesType;

import java.util.Objects;

// Concrete implementation for Herbivores
public class HerbivoresCreationStrategy implements AnimalCreationStrategy {
    @Override
    public Animal createAnimal(SpeciesType speciesType) {
        if (Objects.requireNonNull(speciesType) == SpeciesType.COW) {
            return new Cow();
        }
        throw new IllegalArgumentException("Invalid SpeciesType for Herbivores");
    }
}
