package Pattern.Creational.Factory.abstractFactory;

import Pattern.Creational.Factory.factory.Animal;

public class Lion implements Animal {

    @Override
    public void eat() {
        System.out.println("Lion eats mean!!");
    }
}
