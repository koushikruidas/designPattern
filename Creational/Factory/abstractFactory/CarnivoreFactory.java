package Pattern.Creational.Factory.abstractFactory;

public class CarnivoreFactory implements AnimalFactory{
    @Override
    public Animal createAnimal(String type) {
        switch (type){
            case "LION": return new Lion();
            case "DOG": return new Dog();
            default: throw new IllegalStateException();
        }
    }
}
