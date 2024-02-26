package Pattern.Behavioral.Command;

public class Tv implements Device {
    @Override
    public void turnOn() {
        System.out.println("Tv is on..");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv is off..");
    }

    public void increaseVolume(){
        System.out.println("increasing tv volume..");
    }

    public void decreaseVolume(){
        System.out.println("decreasing tv volume..");
    }
}
