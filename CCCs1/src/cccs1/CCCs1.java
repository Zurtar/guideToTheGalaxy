/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccs1;

import java.util.*;
import java.io.*;

/**
 *
 * @author Zurtar
 */
public class CCCs1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Input
        Scanner Input = new Scanner(System.in);
        String hand = Input.nextLine();
        char currentSuit = 0;
        char a[][] = {{'A', 'K', 'Q', 'J'}, {'4', '3', '2', '1'}, {'0', '0', '0', '0'}}; //a[0] Card repersentation, a[1] Point value of card, a[2] Num of cards of each suit in the current hand
//We have an inpt string of length 17, 13 cards and another 4 suit indicators 
        currentSuit = hand.charAt(0); //first card will be a suit card
       
         
        hand.indexOf('C'); // with these we can know the start and end of each suit without having to go through the string with a loop
        hand.indexOf('D');
        hand.indexOf('H');
        hand.indexOf('S'); hand.contentEquals(sb)

        hand.subSequence(hand.indexOf('C'),1);
        
            
        }
    }

}
}
