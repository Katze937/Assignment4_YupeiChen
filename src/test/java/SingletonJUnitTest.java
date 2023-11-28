

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author isabe
 */

import SingletonDesignPattern.SingletonCalculatorOperation;

import org.junit.Assert;
import org.junit.Test;

public class SingletonJUnitTest {

    @Test
    public void testSingletonInstance() {
        SingletonCalculatorOperation firstInstance = SingletonCalculatorOperation.getInstance();
        SingletonCalculatorOperation secondInstance = SingletonCalculatorOperation.getInstance();

        Assert.assertSame("Instances are not the same", firstInstance, secondInstance);
    }
}

