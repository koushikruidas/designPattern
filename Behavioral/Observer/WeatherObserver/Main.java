package Pattern.Behavioral.Observer.WeatherObserver;

public class Main {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherObserver observer = new WeatherObserver();
        station.addObserver(observer);
        station.setHumidity(75);
        station.setTemperature(27);
        station.setPressure(1);
    }

}
