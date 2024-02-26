package Pattern.Behavioral.Observer.TradingObserver;

public class SellStockListener implements Observer{
    private float price;
    @Override
    public void update(float price) {
        this.price = price;
        sellStock();
    }

    private void sellStock(){
        if (this.price >= 102){
            System.out.println("Sold at : "+price);
        }
    }
}
