package Pattern.Creational.Factory.abstractFactory;

public class HerbivoresFactory implements AnimalFactory{
    @Override
    public Animal createAnimal(String type) {
        switch (type){
            case "COW": return new Cow();
            default: throw new IllegalStateException();
        }
    }
}
