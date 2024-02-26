package Pattern.Behavioral.Observer.WeatherObserver;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObservers();
}
