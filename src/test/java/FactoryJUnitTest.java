/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package FactoryDesignPattern;

import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author isabe
 */
public class FactoryJUnitTest {
    
@Test
    public void testBasicCalculatorCreation() {
        CalculatorInterface calculator = FactoryCalculator.getCalculator("Basic");
        Assert.assertTrue("Factory should create a BasicCalculator", calculator instanceof BasicCalculator);
    }

    @Test
    public void testBasicCalculatorAddition() {
        CalculatorInterface calculator = FactoryCalculator.getCalculator("Basic");
        double result = calculator.add(2, 3);
        Assert.assertEquals("BasicCalculator should add numbers", 5.0, result, 0.001);
    }

    // Additional tests for subtract, multiply, and divide

    @Test
    public void testScientificCalculatorCreation() {
        CalculatorInterface calculator = FactoryCalculator.getCalculator("Scientific");
        Assert.assertTrue("Factory should create a ScientificCalculator", calculator instanceof ScientificCalculator);
    }

}
