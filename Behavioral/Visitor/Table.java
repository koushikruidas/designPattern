package Pattern.Behavioral.Visitor;

public class Table implements ShoppingItem {
    private double price;
    private String name;

    public Table(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
