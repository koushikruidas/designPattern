package Pattern.Behavioral.ResolvingFactoryIssue;

public class Dog implements Animal {

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
