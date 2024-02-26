package Pattern.Creational.Factory;

public class HerbivoresFactory {
    public Herbivores getAnimal(SpeciesType type){
        switch (type){
            case COW:
                return new Cow();
            default:
                return null;
        }
    }
}
