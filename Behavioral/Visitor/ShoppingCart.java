package Pattern.Behavioral.Visitor;

public class ShoppingCart implements Visitor {
    @Override
    public double visit(Table table) {
        return table.getPrice();
    }

    @Override
    public double visit(Chair chair) {
        return chair.getPrice();
    }
}
