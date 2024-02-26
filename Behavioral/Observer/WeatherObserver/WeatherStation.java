package Pattern.Behavioral.Observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private int pressure;
    private int humidity;
    private int temperature;
    private List<Observer> observers;

    public WeatherStation(){
        this.observers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o : observers){
            o.update(pressure,humidity, temperature);
        }
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObservers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObservers();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }
}
