package Pattern.Creational.Factory.abstractFactory;

import Pattern.Creational.Factory.Dog;
import Pattern.Creational.Factory.factory.Animal;

public class AnimalFactory {
    public static Animal createAnimal(String type) throws IllegalAccessException {
        switch (type){
            case "COW": return new Cow();
            case "LION": return new Lion();
            default: throw new IllegalAccessException("Not in list");
        }
    }
}
