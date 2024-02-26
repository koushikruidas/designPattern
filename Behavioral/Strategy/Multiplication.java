package Pattern.Behavioral.Strategy;

public class Multiplication implements Calculation {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
