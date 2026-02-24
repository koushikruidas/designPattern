package Pattern.Creational.Factory.factory;

import Pattern.Creational.Factory.abstractFactory.Animal;

public class Lion implements Animal {

    @Override
    public void eat() {
        System.out.println("Lion eats mean!!");
    }
}
