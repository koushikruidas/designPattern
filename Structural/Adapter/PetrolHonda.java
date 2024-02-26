package Pattern.Structural.Adapter;

public class PetrolHonda implements Vehicle {
    @Override
    public void refillOil() {
        System.out.println("refilling oil for honda..");
    }
}
