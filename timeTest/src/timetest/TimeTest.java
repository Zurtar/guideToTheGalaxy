/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetest;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Zurtar
 */
public class TimeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Random Random = new Random();
        int length = Random.nextInt(2500);
        Random.ints(size, orgin, upperbound).forEach(num -> System.out.print(num));  
    }
      public static int[][] s5_2016() { //BEWARE YE WHO ENTER HERE SHALL FIND NOTHING BUT CHAOS AND if STATEMENTS ABANDON ALL HOPE
        //Circle Of Life - seems easy as hell - is hard 
        Scanner in = new Scanner(System.in); // for getting input
        long n, t; //long not int for those crazy long digits
        String temp;
        n = in.nextLong(); //cell count
        t = in.nextLong(); //generations
        in.nextLine(); //Moving our reader down to the input line
        int[][] a = new int[2][(int) n]; //our array that is size n (had to cast n to a int because it was a long data type)
        temp = in.nextLine();

        /*man getting this string to int was annoying as hell because the numbers had no spaces so they would be seen as one int
        I got around it by throwing it to a string and then getting the numericvalue of each character in the string thats what this
        loop below is*/
        for (int z = 0; z < n; z++) {
            a[0][z] = Character.getNumericValue(temp.charAt(z));
        }

        /*OK!!!! I know the issue we are changing the array as wel go along and check it but
        this will mess with our other checks for example: Cells are {1,1,1} we go through and find that the first cell
                should die so cells become {0,1,1} but now when we check the second we can see there is only one alive cell beside it so it 
                        stays alive when it should be dead causing out cell list to be {0,1,1}*/
 /*
        Solution:  We are using a 2d array the first row of the array will hold our input value and that is where we will check out values from
                    This part of the Array will never be written to only read from(except when setting up the numbers in the array in the for loop above)
                    the second row of the array will only be written to this will allow us to change the values based on if a cell is dead or alive without 
                    changing the cell states of the cells we need to look at. 
        
                       If you would like a clear example of this input 3 for n and 2 for t with a cell list of "111" with breakpoints inserted.
                         It will give a clear indication of how this affects the code and how we are using the 2d array
         */
        for (int j = 0; j < t; j++) { //this loop is for generationssssss
            for (int i = 0; i < a[1].length; i++) {
                //if one of the cells that are next the current cell we are looking at has a one value next to it
                //no idea how I am going to handle checking the first and last valuee

                //condtion for first index
                if (i == 0) {
                    //we use XOR gate so if both values are 1 it wont be true
                    if (a[0][i + 1] == 1 ^ a[0][a[1].length - 1] == 1) {
                        a[1][i] = 1;
                    } else {
                        a[1][i] = 0;
                    }

                    //conditon for last index
                } else if (i == a[1].length - 1) {
                    if (a[0][i - 1] == 1 ^ a[0][0] == 1) {
                        a[1][i] = 1;
                    } else {
                        a[1][i] = 0;
                    }

                    //condtion for rest of indexs/indexes (dont know which one is right)
                } else if (a[0][i - 1] == 1 ^ a[0][i + 1] == 1) {
                    a[1][i] = 1;
                } else {
                    a[1][i] = 0;
                }
            }
            /*at the end of each generation we must move the second row values to the first
                man for some reason after gen 1 whenever we change a value of the
                second array it changes the value of the first as well and im not sure why even with 
                bbreakpoints it never hits the line below when it does this so what the hell is up.*/
            System.out.println();
            //a[0] = a[1];
            for (int p = 0; p < a[0].length; p++) {
                a[0][p] = a[1][p];
            }
        }
        return (a);
    }
}
//Jesus christ thats a pretty face the kind ID find on someone I can save if htey dont put me away well it would bea mircale doyou ever thin o flooking somewhere elsewhere this proble,s onna=


