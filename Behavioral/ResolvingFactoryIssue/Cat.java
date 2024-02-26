package Pattern.Behavioral.ResolvingFactoryIssue;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating..");
    }

    @Override
    public void numberOfLegs() {
        System.out.println("Cat has 4 legs..");
    }

    @Override
    public void type() {
        System.out.println("Cat is carnivores..");
    }
}
