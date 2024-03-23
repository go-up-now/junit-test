/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.huunghia.core;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    
    @Test
    public void checkFactorial(){
        long expected = 120;
        long actual = Factorial.getFactorial(5);
        Assert.assertEquals(expected, actual);
        
        Assert.assertEquals(1, Factorial.getFactorial(0));
        
        Assert.assertEquals(1, Factorial.getFactorial(1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialException(){
        Factorial.getFactorial(-2);
    }
    
}
