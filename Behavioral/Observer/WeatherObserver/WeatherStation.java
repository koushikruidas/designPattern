package Pattern.Behavioral.Observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Publisher {

    private int pressure;
    private int humidity;
    private int temperature;
    private List<Subscriber> subscribers;

    public WeatherStation(){
        this.subscribers = new ArrayList<>();
    }
    @Override
    public void addSubscriber(Subscriber o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Subscriber o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyAllSubscribers() {
        for (Subscriber o : subscribers){
            o.update(pressure,humidity, temperature);
        }
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllSubscribers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllSubscribers();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllSubscribers();
    }
}
