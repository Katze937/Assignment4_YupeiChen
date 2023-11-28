/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryDesignPattern;

/**
 *
 * @author isabe
 */
public class ScientificCalculator implements CalculatorInterface {



    @Override
    public double add(double a, double b) {
        throw new UnsupportedOperationException("Add operation not supported in ScientificCalculator");
    }
    
    @Override
    public double subtract(double a, double b) {
        throw new UnsupportedOperationException("Add operation not supported in ScientificCalculator");
    }
    
    @Override
    public double divide(double a, double b) {
        throw new UnsupportedOperationException("Add operation not supported in ScientificCalculator");
    }
    
        @Override
    public double multiply(double a, double b) {
        throw new UnsupportedOperationException("Add operation not supported in ScientificCalculator");
    }

    // Implement other methods or throw UnsupportedOperationException...
    
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
