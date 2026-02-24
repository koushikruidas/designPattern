package Pattern.Creational.Factory.abstractFactory;

class FactoryProvider {

    public static AnimalFactory getFactory(String category) {
        switch (category) {
            case "CARNIVORE": return new CarnivoreFactory();
            case "HERBIVORE": return new HerbivoresFactory();
            default: throw new IllegalArgumentException();
        }
    }
}