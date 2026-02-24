package Pattern.Behavioral.Observer.WeatherObserver;

public interface Publisher {
    void addSubscriber(Subscriber subscriber);
    void removeObserver(Subscriber subscriber);
    void notifyAllSubscribers();
}
