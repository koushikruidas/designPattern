package Pattern.Behavioral.ResolvingFactoryIssue;

public class Tiger implements Animal {
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

    public void behave(){
        System.out.println("Tiger kills herbivores..");
    }
}
