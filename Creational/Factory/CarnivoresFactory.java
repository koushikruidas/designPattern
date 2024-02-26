package Pattern.Creational.Factory;

public class CarnivoresFactory {
    public Carnivores getAnimal(SpeciesType type) {
        switch (type) {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            case LION:
                return new Lion();
            case TIGER:
                return new Tiger();
            default:
                return null;
        }
    }
}
