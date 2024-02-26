package Pattern.Structural.Adapter;

public class ElectricHonda implements ElectricVehicle {
    @Override
    public void charge(){
        System.out.println("Charging electric honda..");
    }
}
