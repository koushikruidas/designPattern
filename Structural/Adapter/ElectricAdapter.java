package Pattern.Structural.Adapter;

public class ElectricAdapter implements Vehicle {

    ElectricVehicle electricVehicle;
    public ElectricAdapter(ElectricVehicle electricVehicle){
        this.electricVehicle = electricVehicle;
    }
    @Override
    public void refillOil() {
        electricVehicle.charge();
    }
}
