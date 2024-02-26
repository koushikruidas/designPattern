package Pattern.Structural.Decorator;

public class Coffee extends BeverageDecorator {
    Beverage beverage;
    public Coffee(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }
    @Override
    public int getCost() {
        return beverage.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", added coffee";
    }
}
