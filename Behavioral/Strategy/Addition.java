package Pattern.Behavioral.Strategy;

public class Addition implements Calculation {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
