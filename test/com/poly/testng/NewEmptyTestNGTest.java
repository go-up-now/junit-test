/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.poly.testng;

import com.huunghia.core.SumTestNG;
import org.testng.Assert;
import org.testng.annotations.Test;




/**
 *
 * @author Van Bao
 */
public class NewEmptyTestNGTest {
    
    @Test
    public void testSum(){
        Assert.assertEquals(10.0, SumTestNG.sum(5, 5));
//        Assert.assertEquals(10, SumTestNG.sum(5, 3));
    }
    
}
