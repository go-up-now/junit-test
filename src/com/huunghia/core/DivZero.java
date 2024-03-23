/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huunghia.core;

/**
 *
 * @author Van Bao
 */
public class DivZero {
    public static double divide(int a, int b) throws Exception{
        if(b == 0)
            throw new ArithmeticException();
        return a / b;
    }
}
