/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sadboihours;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Zurtar
 */
public class Sadboihours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int[][] a = s5_20016c();
        for (int j = 0; j < a[0].length; j++) {
            System.out.print(a[0][j]);

        }
    }

    public static int[][] s5_2016c() { //BEWARE YE WHO ENTER HERE SHALL FIND NOTHING BUT CHAOS AND if STATEMENTS ABANDON ALL HOPE
        //Circle Of Life - seems easy as hell - is hard 
        Scanner in = new Scanner(System.in); // for getting input
        long n, t; //long not int for those crazy long digits
        String temp;
        n = in.nextLong(); //cell count
        t = in.nextLong(); //generations
        in.nextLine(); //Moving our reader down to the input line
        Integer[][] a = new Integer[2][(int) n]; //our array that is size n (had to cast n to a int because it was a long data type)
        temp = in.nextLine();
        in.close();
        for (int z = 0; z < n; z++) {
            a[0][z] = Character.getNumericValue(temp.charAt(z));
        }
        for (int j = 0; j < t; j++) { //this loop is for generations
            for (int i = 0; i < a[1].length; i++) {

                try {
                    if (a[0][i - 1] == 1 ^ a[0][i + 1] == 1) {
                        a[1][i] = 1;
                    } else {
                        a[1][i] = 0;
                    }
                } catch (ArrayIndexOutOfBoundsException error) {
                    if (i == 0) {
                        if (a[0][i + 1] == 1 ^ a[0][a[1].length - 1] == 1) {
                            a[1][i] = 1;
                        } else {
                            a[1][i] = 0;
                        }
                    } else {
                        //last index!
                        if (a[0][i - 1] == 1 ^ a[0][0] == 1) {
                            a[1][i] = 1;
                        } else {
                            a[1][i] = 0;
                        }
                    }
                }
            }
            a[0] = a[1].clone();
        }
        return (a);
    }

    public static int[][] s5_20016c() throws IOException { //BEWARE YE WHO ENTER HERE SHALL FIND NOTHING BUT CHAOS AND if STATEMENTS ABANDON ALL HOPE
        //Circle Of Life - seems easy as hell - is hard 
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        long t = Long.parseLong(st.nextToken());
        String temp = in.readLine();

        int[][] a = new int[2][(int) n]; //our array that is size n (had to cast n to a int because it was a long data type)

        for (int z = 0; z < n; z++) {
            a[0][z] = Character.getNumericValue(temp.charAt(z));//if we can find a faster way to do this im so down
        }
        for (int j = 0; j < t; j++) { //this loop is for generations
            for (int i = 0; i < a[1].length; i++) {

                try {
                    //every index but first and last
                    if (a[0][i - 1] == 1 ^ a[0][i + 1] == 1) {
                        a[1][i] = 1;
                    } else {
                        a[1][i] = 0;
                    }
                } catch (ArrayIndexOutOfBoundsException error) {
                    if (i == 0) {
                        //first index
                        if (a[0][i + 1] == 1 ^ a[0][a[1].length - 1] == 1) {
                            a[1][i] = 1;
                        } else {
                            a[1][i] = 0;
                        }
                    } else {
                        //last index!
                        if (a[0][i - 1] == 1 ^ a[0][0] == 1) {
                            a[1][i] = 1;
                        } else {
                            a[1][i] = 0;
                        }
                    }
                }
            }
            a[0] = a[1].clone();
        }
        return (a);
    }
}
