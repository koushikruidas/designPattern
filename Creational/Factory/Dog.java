package Pattern.Creational.Factory;

public class Dog implements Carnivores {

    @Override
    public void eat() {
        System.out.println("Dog is eating..");
    }

    @Override
    public void numberOfLegs() {
        System.out.println("Dog has 4 legs..");
    }

    @Override
    public void type() {
        System.out.println("Dog is carnivores..");
    }
}
