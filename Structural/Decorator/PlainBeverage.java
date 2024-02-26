package Pattern.Structural.Decorator;

public class PlainBeverage implements Beverage {
    private int price;
    private String description;

    public PlainBeverage(int price, String description){
        this.price = price;
        this.description = description;
    }
    @Override
    public int getCost() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
