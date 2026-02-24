package Pattern.Creational.Factory.abstractFactory;

public class Dog implements Carnivores{
    @Override
    public void eat() {
        System.out.println("Dog eats meat. !!");
    }
}
