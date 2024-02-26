package Pattern.Behavioral.Command;

public class Thermostat implements Device {
    @Override
    public void turnOn() {
        System.out.println("Thermostat is on..");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is off..");
    }

    public void increaseTemp(){
        System.out.println("increasing temp..");
    }

    public void decreaseTemp(){
        System.out.println("decreasing temp..");
    }
}
