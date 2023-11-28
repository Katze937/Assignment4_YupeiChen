/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryDesignPattern;

/**
 *
 * @author isabe
 */
public class FactoryCalculator {

    public static CalculatorInterface getCalculator(String type) {
        if ("Basic".equalsIgnoreCase(type)) {
            return new BasicCalculator();
        } else if ("Scientific".equalsIgnoreCase(type)) {
            return new ScientificCalculator();
        }
        throw new IllegalArgumentException("Unknown Calculator Type");
    }
}
