/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author theda
 */
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main3();
        /* //Setup Scanner
        Scanner in = new Scanner(System.in);
        //array for input
        int num[];
        num = new int[4];

        //Getting user input
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
            in.nextLine();
        }
        //Checking array values -- 
        if (num[0] == 8 || num[0] == 9 && num[3] == 8 || num[3] == 9 && num[1] == num[2]) {
            System.out.println("ignore");
        } else {
            System.out.println("answer");
        }*/
    }

//https://dmoj.ca/problem/nccc6j1
    public static void Main() {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        in.nextLine();
        b = in.nextInt();
        int i = a - b;

        if (i == 0) {

        } else if (i > 0) {
            System.out.println("CS452");
        } else {
            System.out.println("PHIL145");
        }
    }

    public static void Main2() {
        //using ASCII values to check was a dead end 
        int counter = 0;
        Scanner in = new Scanner(System.in);
        String input;
        input = in.nextLine();
        char a[] = {'p', 'u', 's', 'h', 'e', 'e', 'n'};
        char b[] = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {

            if (a[i] != b[i]) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void Main3() {
        //We are taking the blank line inbetween input and writting them like the rest gotta fix that 
        Scanner in = new Scanner(System.in);
        char[][][] grid = new char[6][6][6];
        char[] write;

        //arrays are [panel][row][collum]
        for (int z = 0; z < grid.length; z++) {
            for (int i = 0; i < grid.length; i++) {
                String input = in.nextLine();
                if (input.isEmpty() == false && input.length() > 6) {
                    write = input.toCharArray();
                    System.arraycopy(write, 0, grid[z][i], 0, grid.length);
                } else {
                    i--;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 0; j < 6; j++) {
                System.out.print("\n" + Arrays.toString(grid[i][j]));
            }
        }
//1,1,0 is our fail point   
        /* int counter = 0;
        int winCount = 0;
        //checking for red tiles in a row 
        for (int z = 0; z < grid.length; z++) {
            for (int i = 0; i < grid.length; i++) {
                if (counter == 6) {
                    winCount++;
                } else {
                    counter = 0;
                }
                for (int j = 0; j < grid.length; j++) {
                    if (grid[z][i][j] == 'R') {
                        counter++;
                    }
                }
            }

        }*/
    }
}
