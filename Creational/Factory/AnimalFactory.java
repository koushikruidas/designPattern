package Pattern.Creational.Factory;

public class AnimalFactory {
    public Animal getAnimal(AnimalType type, SpeciesType speciesType){
        switch (type){
            case CARNIVORES:
              return new CarnivoresFactory().getAnimal(speciesType);
            case HERBIVORES:
                return new HerbivoresFactory().getAnimal(speciesType);
            default:
                return null;
        }
    }
}
