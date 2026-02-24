package Pattern.Behavioral.Observer.WeatherObserver;

public interface Subscriber {
    void update(int pressure, int humidity, int temprature);
}
