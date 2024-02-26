package Pattern.Behavioral.ResolvingFactoryIssue;

public class Cow implements Animal {
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
