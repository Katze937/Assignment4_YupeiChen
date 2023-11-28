/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryDesignPattern;

/**
 *
 * @author isabe
 */
public class BasicCalculator implements CalculatorInterface {



    
    
    @Override
    public double add(double a, double b) {
        return a + b;
    }
    
    @Override
    public double subtract(double a, double b)
    {
        return a - b;
    }
    
    @Override
    public double multiply(double a, double b)
    {
        return a * b;
    }
    
    @Override
    public double divide(double a, double b)
    {
        return a / b;
    }
    // Implement other basic operations...

    @Override
    public double power(double base, double exponent) {
        // Basic calculator does not support power operation
        throw new UnsupportedOperationException("Power operation not supported in BasicCalculator");
    }
}
