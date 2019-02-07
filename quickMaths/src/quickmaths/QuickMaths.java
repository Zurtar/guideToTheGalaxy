/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickmaths;

import static java.lang.Math.floor;

/**
 *
 * @author theda
 */
public class QuickMaths {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   multiples(1000, 3, 5);
    }
    
    //If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    //Find the sum of all the multiples of 3 or 5 below 1000.
   static void multiples(int x, int y, int z){
        int sum=0; 
    for (float i=0; i < x; i++){
        if(i%3==0){
               sum+=i;
        } 
        else if(i%5==0){
               sum += i;
        }
           System.out.println("Run Number: "+i+"        Sum: "+sum);
    }
System.out.print("\n Sum of The Mutiples Of "+y+" and "+z+" Up To "+x+": "+sum+"\n");
    }
}
   
   
   