package Pattern.Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        Vehicle toyota = new PetrolToyota();
        Vehicle honda = new PetrolHonda();
        Vehicle electricHonda = new ElectricAdapter(new ElectricHonda());
        toyota.refillOil();
        honda.refillOil();
        electricHonda.refillOil();
    }
}
