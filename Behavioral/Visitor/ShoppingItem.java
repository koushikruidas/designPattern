package Pattern.Behavioral.Visitor;

public interface ShoppingItem {
    double accept(Visitor visitor);
}
