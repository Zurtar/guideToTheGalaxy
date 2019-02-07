/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem_2_10;

import java.io.*;
import java.util.*;

/**
 *
 * @author theda
 */

public class EvenFibonacciNumbers {

    /**
     *
     * @param args
     */
    
// This is not viable right now takes up so much power to go to 4 mil
    // n = n-1 + n-2
    //  sum+= (n-1)+n-2

    //ok we cant check every n value up to 4 million our procecor is going to kill itself 
    //jank jank un clean jank
    static long fib(long x) {
        //x is max fib value
        int sum = 0;
        int a = 1;
        int b = 1;
        int c = a + b;
        while (c <= x) {
            sum += c;
            a = b + c;
            b = c + a;
            c = a + b;
        }
        return (sum);
    }
}
