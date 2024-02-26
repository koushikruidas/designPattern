package Pattern.Creational.Factory;

public class Cow implements Herbivores {
    @Override
    public void eat() {
        System.out.println("Cow is eating..");
    }

    @Override
    public void numberOfLegs() {
        System.out.println("Cow has 4 legs..");
    }

    @Override
    public void type() {
        System.out.println("Cow is herbivores..");
    }
}
