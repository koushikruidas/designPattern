package Pattern.Behavioral.Observer.WeatherObserver;

public class WeatherSubscriber implements Subscriber {

    private int pressure;
    private int humidity;
    private int temperature;
    @Override
    public void update(int pressure, int humidity, int temperature) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;

        showData();
    }

    private void showData(){
        System.out.println("Pressure: "+pressure+"-"+"Temperature: "+ temperature +"-"+"Humidity: "+humidity);
    }
}
