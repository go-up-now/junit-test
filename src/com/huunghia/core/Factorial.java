/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huunghia.core;

/**
 *
 * @author Van Bao
 */
public class Factorial {
    public static long getFactorial(int n){
        if(n == 0 || n == 1)
            return 1;
        else if(n < 0)
            throw new IllegalArgumentException("n must be between 0...20");
        
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
