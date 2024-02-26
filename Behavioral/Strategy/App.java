package Pattern.Behavioral.Strategy;

public class App {
    private Calculation calculation;
    App(Calculation calculation){
        this.calculation = calculation;
    }

    public void execute(int a, int b){
        System.out.println(calculation.execute(a,b));
    }
}
