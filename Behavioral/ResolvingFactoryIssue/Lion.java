package Pattern.Behavioral.ResolvingFactoryIssue;

public class Lion implements Animal {
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
