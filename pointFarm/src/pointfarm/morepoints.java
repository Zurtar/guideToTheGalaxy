/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointfarm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

/**
 *
 * @author Zurtar
 */
public class morepoints {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n, count = 0;
        n = Integer.parseInt(st.nextToken());
        
        for (int i = 1; i <= n; i++) {
            if (n-i>=0) {
                count++;
            }
        }
        
        System.out.println(count);
        /**
         * take our number then subtract by i..n if the remainder is greater
         * then zero then add one to current combination count eventually we
         * will hit situations of 5-2=3 so the pair is 2,3 and 5-3=2 so the pair
         * is 3,2
         *
         * so we divide our count by 2 and then round up I belive to get our
         * ouput
         *
         * 5-1=4 ... 4,1 5-2=3 ... 3,2 5-3=2 ... 2,3
         */
    }
}
/**
 * Natalie is learning to count on her fingers. When her Daddy tells her a
 * number n (1≤n≤10), she asks "What is n, Daddy?", by which she means "How many
 * fingers should I hold up on each hand so that the total is n?"
 *
 * To make matters simple, her Daddy gives her the correct finger representation
 * according to the following rules:
 *
 * the number may be represented on one or two hands; if the number is
 * represented on two hands, the larger number is given first. For example, if
 * Natalie asks "What is 4, Daddy?", her Dad may reply:
 *
 * 4 is 4. 4 is 3 and 1. 4 is 2 and 2. Your job is to make sure that Natalie's
 * Daddy gives the correct number of answers.
 */
