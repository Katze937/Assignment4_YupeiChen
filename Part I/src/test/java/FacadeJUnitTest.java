/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isabe
 */
package FacadeDesignPattern;

import org.junit.Assert;
import org.junit.Test;

public class FacadeJUnitTest {

    @Test
    public void testPerformAddition() {
        FacadeCalculator calculator = new FacadeCalculator();
        Assert.assertEquals("Addition failed", 5.0, calculator.PerformAdd(2, 3), 0.0);
    }

    @Test
    public void testPerformSubtraction() {
        FacadeCalculator calculator = new FacadeCalculator();
        Assert.assertEquals("Subtraction failed", 1.0, calculator.PerformSubtract(4, 3), 0.0);
    }

    @Test
    public void testPerformMultiplication() {
        FacadeCalculator calculator = new FacadeCalculator();
        Assert.assertEquals("Multiplication failed", 12.0, calculator.PerformMultiply(4, 3), 0.0);
    }

    @Test
    public void testPerformDivision() {
        FacadeCalculator calculator = new FacadeCalculator();
        Assert.assertEquals("Division failed", 2.0, calculator.PerformDivide(6, 3), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPerformDivisionByZero() {
        FacadeCalculator calculator = new FacadeCalculator();
        calculator.PerformDivide(1, 0);
    }
}

