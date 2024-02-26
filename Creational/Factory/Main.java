package Pattern.Creational.Factory;

public class Main {
    public static void main(String[] args) {
        CarnivoresFactory carnivoresFactory = new CarnivoresFactory();
        Carnivores dog = carnivoresFactory.getAnimal(SpeciesType.DOG);
        dog.type();
        HerbivoresFactory herbivoresFactory = new HerbivoresFactory();
        Herbivores cow = herbivoresFactory.getAnimal(SpeciesType.COW);
        cow.type();

        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.getAnimal(AnimalType.CARNIVORES,SpeciesType.CAT);
        /**
         * This if-else condition is bad design pattern.
         * As this if we add any other species then we need to change the code.
         * We won't be able to make chnages in the runtime.
         * Also, this if-else codition adds cyclomatic complexity.
         * Means it we need to test each branches of the if-else statement.
         * Please look on Strategy pattern, where I resolved this issue using the Strategy pattern.
         */

        /**
         * Cyclomatic complexity: It is a quantitve measure of the number of linearly independent paths through a program's
         * source code.
         */
        if (animal instanceof Carnivores){
            ((Carnivores) animal).type();
        } else if (animal instanceof Herbivores) {
            ((Herbivores) animal).type();
        }

    }
}
