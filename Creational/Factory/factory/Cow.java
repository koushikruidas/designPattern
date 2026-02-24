package Pattern.Creational.Factory.abstractFactory;

import Pattern.Creational.Factory.factory.Animal;

public class Cow implements Animal {
    @Override
    public void eat() {
        System.out.println("Cow eats grass!");
    }
}
