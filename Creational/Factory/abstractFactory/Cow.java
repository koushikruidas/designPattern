package Pattern.Creational.Factory.abstractFactory;

public class Cow implements Herbivores{
    @Override
    public void eat() {
        System.out.println("Cow eats grass. !!");
    }
}
