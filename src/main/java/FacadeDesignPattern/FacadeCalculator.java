package FacadeDesignPattern;


public class FacadeCalculator {
    public double PerformAdd(double a, double b) {
        return a + b;
    }

    public double PerformSubtract(double a, double b) {
        return a - b;
    }

    public double PerformMultiply(double a, double b) {
        return a * b;
    }

    public double PerformDivide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
