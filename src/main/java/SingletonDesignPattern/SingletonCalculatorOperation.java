package SingletonDesignPattern;



import javax.swing.JOptionPane;

public class SingletonCalculatorOperation {
    private static SingletonCalculatorOperation instance = new SingletonCalculatorOperation();

    private SingletonCalculatorOperation() {
        // Private constructor
    }

    public static SingletonCalculatorOperation getInstance() {
        return instance;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
