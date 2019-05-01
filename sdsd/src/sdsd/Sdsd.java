/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdsd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

/**
 *
 * @author Zurtar
 */
public class Sdsd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int orgin, end;
        orgin = Integer.parseInt(br.readLine());
        end = Integer.parseInt(br.readLine());
        
        
        /**
         * square every i value up to sqrt(end)
         * 
         * then cube every j value up to i*i until j*j*j = i*i
         * if this is true tthen we have found a cool number keep doing this untill we have hit
         * our limit. which is sqrt(end)
         */
        
        
        /**
         * Below is an chessboard on which we will designate square locations
         * using the ordered pairs as indicated. For example, notice that piece
         * is at position and piece is at position . A knight is a special game
         * piece that can leap over other pieces, moving in the "L" pattern.
         * Specifically, in the diagram below, represents the knight's starting
         * position and the numbers 1 through 8 represent possible places the
         * knight may move to. Time Limit: 2.0s Memory Limit: 64M 8 × 8 A (2, 2)
         * B (4, 3) K Page 2 of 3 Your program will read the starting location
         * of the knight and output the smallest number of jumps or moves needed
         * to arrive at a location specified in the second input.F
         *
         *
         * problem text above
         *
         * Given a 8x8 board of SQUARES with the bottom left squares cords are
         * 1,1
         *
         * we are given a starting postion and an ending postion our knight can
         * move like a normal Knight in chess
         *
         * Math for movement from point 4,4
         *
         *
         * endPos 6,5: 4+2,4+1
         *
         * endPos 5,6=4+1
         *
         * when moving from x,x to y,y
         *
         * when moving the total change of the two transitons will be an
         * absolute value of 3 movements this means that if one dimension is
         * being added/subtracted by 2 the other dimension must be
         * added/subtracted by 1 the reverse is also true.
         */
    }
}
