package Pattern.Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ShoppingItem> items = new ArrayList<>();
        items.add(new Table(2000,"table1"));
        items.add(new Chair(1200,"chair1"));
        items.add(new Table(50000, "dinning table"));
        ShoppingCart cart = new ShoppingCart();
        double sum = 0;
        for (ShoppingItem item : items){
            sum += item.accept(cart);
        }
        System.out.println("Total price: "+sum);
    }
}
