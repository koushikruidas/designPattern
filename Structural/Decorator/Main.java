package Pattern.Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Beverage plain = new PlainBeverage(2,"plain beverage");
        Beverage milk = new Milk(plain);
        Beverage coffee = new Coffee(milk);
        System.out.println(coffee.getDescription()+". costs: "+coffee.getCost());;
    }
}
