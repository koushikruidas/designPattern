package Pattern.Creational.Factory;

public class Tiger implements Carnivores {
    @Override
    public void eat() {
        System.out.println("Tiger is eating..");
    }

    @Override
    public void numberOfLegs() {
        System.out.println("Tiger has 4 legs..");
    }

    @Override
    public void type() {
        System.out.println("Tiger is carnivores..");
    }
}
