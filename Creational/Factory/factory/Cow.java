package Pattern.Creational.Factory.factory;

import Pattern.Creational.Factory.abstractFactory.Animal;

public class Cow implements Animal {
    @Override
    public void eat() {
        System.out.println("Cow eats grass!");
    }
}
