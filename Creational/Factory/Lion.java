package Pattern.Creational.Factory;

public class Lion implements Carnivores  {
    @Override
    public void eat() {
        System.out.println("Lion is eating..");
    }

    @Override
    public void numberOfLegs() {
        System.out.println("Lion has 4 legs..");
    }

    @Override
    public void type() {
        System.out.println("Lion is carnivores..");
    }
}
