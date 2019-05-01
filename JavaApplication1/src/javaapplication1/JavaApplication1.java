/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Zurtar
 */
import java.util.*;
import java.io.*;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Long> a = new ArrayList<>();
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        long n = Long.parseLong(in.nextLine());

        //we have input now we need to populate the list with our numbers from 2 to n (n being our input val)
        for (long i = 2; i < n; i++) {
            a.add(i);
        }
        //sieve

        System.out.println(sieve(a, 2));
    }

    //because the algorithm works by removing elements in an array based on indec value we cant use the Array list 
    //if we used the arraylist datat type the index willl be removed instead of being set to zero causing our algorithm to remove the incorrect number at the next index
    //to get around this problem we could cast the ArrayList to a Long Array type and then cast it back to an Arraylist before recursion
    public static long sieve(ArrayList<Long> a, long p) {
        //a - Our ArrayList
        //b - Our array 
        //p - current largest prime factor
        long[] b = arrayListToArray(a);
        for (int i = 0; i < b.length; i++) { //every multiple of p will be set to zero
            if (b[i] % p == 0) { //if any givenvalue in the list can be divided by p with no remained it is a multiple of p
                b[i] = 0;
            }
        }
        //at this point every mutiple of current p value bhas been set to zero
        for (int i = 0; i < b.length; i++) {
            if (b[i] > p) {
                return (sieve(arrayToList(b), b[i]));
            }
        }
        return (p);
    }

    public static ArrayList<Long> arrayToList(long[] array) {
        //will take an array and convert all non zero values to a list
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                list.add(array[i]);
            }
        }
        return (list);
    }

   

    public static long[] arrayListToArray(ArrayList<Long> list) {
        //will take an ArrayList and convert to an array
        long[] array = new long[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return (array);
    }
}
