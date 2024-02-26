package Pattern.Behavioral.Observer.TradingObserver;

public class BuyStockListener implements Observer{
    private float price;
    @Override
    public void update(float price) {
        this.price = price;
        buyStock();
    }

    private void buyStock(){
        if (this.price <= 98){
            System.out.println("Bought at : "+price);
        }
    }
}
