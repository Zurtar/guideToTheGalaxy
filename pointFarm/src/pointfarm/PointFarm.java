/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointfarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Zurtar
 */
public class PointFarm {

    static ArrayList<String> list = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        /**
         * Martha takes a jar of quarters to the casino with the intention of
         * becoming rich. She plays three machines in turn. Unknown to her, the
         * machines are entirely predictable. Each play costs one quarter. The
         * first machine pays 30 quarters every 35th time it is played; the
         * second machine pays 60 quarters every 100th time it is played; the
         * third pays 9 quarters every 10th time it is played.
         *
         * we are given n, R(i) where r is the remaing quarters in a machines
         * 
         */
    }

    public static void j1_2003(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t, s, h;
        /**
         * t- Height of tines s - spaces between tines h- height of handle
         */
        t = Integer.parseInt(in.readLine());
        s = Integer.parseInt(in.readLine());
        h = Integer.parseInt(in.readLine());

        //tine
        for (int j = 0; j < t; j++) {
            for (int i = 0; i < 2; i++) {
                System.out.print('*');
                for (int z = 0; z < s; z++) {
                    System.out.print(" ");
                }
            }
            System.out.print("* \n");
        }

        //hilt
        for (int i = 0; i < (2 * s) + 3; i++) {
            System.out.print('*');
        }

        //handle
        System.out.println();
        for (int z = 0; z < h; z++) {
            for (int i = 0; i < 1 + s; i++) {
                System.out.print(" ");
            }
            System.out.println('*');
        }
    }

    public static void j1_2002(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String temp = "start";
        while (temp.equals("quit!") == false) {
            temp = in.readLine();
            String subString = temp.substring(temp.length() - 3, temp.length());
            if (temp.equals("quit!")) {
                break;
            } else if (subString.contains("or") && temp.length() > 4) {
                if (subString.charAt(0) != 'a' && subString.charAt(0) != 'e' && subString.charAt(0) != 'i' && subString.charAt(0) != 'o' && subString.charAt(0) != 'u' && subString.charAt(0) != 'y') {
                    temp = temp.substring(0, temp.length() - 2) + "our";
                }
            }
            System.out.println(temp);
        }
    }

}
