package Pattern.Behavioral.Observer.WeatherObserver;

public interface Observer {
    void update(int pressure, int humidity, int temprature);
}
