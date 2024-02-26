package Pattern.Behavioral.Strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // abstruct layer in between high level modules and low level modules
        // we have to use composition
        //  BECAUSE THE BEHAVIOUR CAN BE CHANGED AT RUN-TIME

        /**
         * The Strategy Design Pattern is a behavioral design pattern.
         * It allows you to dynamically change the behavior of an object by encapsulating it into different strategies.
         * This pattern enables an object to choose from multiple algorithms and behaviors at runtime,
         * rather than statically choosing a single one.
         */
        App app = new App(new Addition());
        app.execute(3,4);

        App multiplication = new App(new Multiplication());
        multiplication.execute(3,4);    }
}
