package Pattern.Behavioral.Observer.WeatherObserver;

public class Main {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherSubscriber subscriber = new WeatherSubscriber();
        station.addSubscriber(subscriber);
        station.setHumidity(75);
        station.setTemperature(27);
        station.setPressure(1);
        station.removeObserver(subscriber);
    }

}
