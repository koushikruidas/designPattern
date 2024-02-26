package Pattern.Behavioral.Observer.TradingObserver;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObservers(float price);
}
