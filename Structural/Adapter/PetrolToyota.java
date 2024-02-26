package Pattern.Structural.Adapter;

public class PetrolToyota implements Vehicle {
    @Override
    public void refillOil() {
        System.out.println("refilling oil for toyota..");
    }
}
