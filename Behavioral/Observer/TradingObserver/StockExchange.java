package Pattern.Behavioral.Observer.TradingObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchange implements Subject {
    // s(t=0) stock price.
    private float price = 100;
    private Random random;
    private List<Observer> observers;

    public StockExchange(){
        random = new Random();
        observers = new ArrayList<>();
    }

    public void start(){
        while (true){
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            // generate the next s(t+1) random stock price.
            // 2 * random.nextFloat() - 1 this will generate random value in 1 to -1 range.
            price = price + 2 * random.nextFloat() - 1;
            System.out.println("price from stockExchange: "+price);
            notifyAllObservers(price);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(float price) {
        for (Observer o : observers){
            o.update(price);
        }
    }
}
