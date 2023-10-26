package org.example.exercise2;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public ChocolateBoiler() {
        /*
         * This code is only started when
         * the boiler is empty!
         */
        empty = true;
        boiled = false;
    }

    public void fill() {
        /*
         * To fill the boiler it must be empty, and,
         * once it’s full, we set the empty
         * and boiled flags.
         */
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        /*
         * To drain the boiler, it must be full (non-empty)
         * and also boiled. Once it is
         * drained, we set empty back to true.
         */
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
            boiled = false;
        }
    }

    public void boil() {
        /*
         * To boil the mixture, the boiler has to be
         * full and not already boiled. Once
         * it’s boiled, we set the boiled flag to true.
         */
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
