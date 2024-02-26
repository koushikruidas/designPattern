package Pattern.Behavioral.Observer.TradingObserver;

public class Main {
    public static void main(String[] args) {
        /**
         * In software design and engineering, the observer pattern is a software design pattern in which an object,
         * named the subject, maintains a list of its dependents, called observers,
         * and notifies them automatically of any state changes, usually by calling one of their methods.
         *
         * The observer pattern addresses the following problems:
         * A one-to-many dependency between objects should be defined without making the objects tightly coupled.
         * When one object changes state, an open-ended number of dependent objects should be updated automatically.
         * An object can notify multiple other objects.
         */

        StockExchange exchange = new StockExchange();
        BuyStockListener buyStockListener = new BuyStockListener();
        SellStockListener sellStockListener = new SellStockListener();
        exchange.addObserver(buyStockListener);
        exchange.addObserver(sellStockListener);
        exchange.start();
    }
}
