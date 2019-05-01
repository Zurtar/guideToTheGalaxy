/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dickingaround;

import java.util.*;
import java.io.*;

/**
 *
 * @author Zurtar
 */
public class DICKINGaround {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Ok so this basicly only works for art that is the same width and length so nothing it
            it also has some issues with grabbing the input if the size is off you will get really odd outputs without
        actually telling you why all in all it does not do its function and should be thrown to the oblivion of my dropbox
        godspeed friend.
        */
        /*  Args
          k --> Factor To Enlargen By
          d --> Dimension Of Art (2x2, 1923x 1923)
         */
        int k, d;
        char[][] icon;
        Scanner in = new Scanner(System.in);

        System.out.print("Please Enter The Dimension Of The Art (it must be equal length and width) ---->  ");
        d = in.nextInt();
        System.out.print("\n" + "Enter The Factor Of Enlargement: ");
        k = in.nextInt();
        icon = new char[d][d];
        System.out.print("Paste The Art Below: " + "\n");
        in.nextLine();
        
         for (int j = 0; j < d; j++) {
            String temp = in.nextLine();
            icon[j] = temp.toCharArray();
        }

         
         System.out.println("The Enlargened Art Will Be Shown Below: \n");
        for (int j = 0; j < icon.length; j++) {  //prints 3 seprate chracters k times
            for (int z = 0; z < k; z++) {
                for (int i = 0; i < icon.length; i++) {
                    for (int x = 0; x < k; x++) {
                        //prints one character k times
                        System.out.print(icon[j][i]);
                    }
                }
                System.out.println();
            }
        }

//ok so we have factored our 3x3 grid into a (3*k)x3 grid! progress!
//EACH LINE NEEDS TO BE PRINTED 3 MORE TIMES AND ITS PERFECT
//um ok it works for input of 3 only??/ and still throws a out of bound exception
    }
}
/*


                             .-----.
                            /7  .  (
                           /   .-.  \
                          /   /   \  \
                         / `  )   (   )
                        / `   )   ).  \
                      .'  _.   \_/  . |
     .--.           .' _.' )`.        |
    (    `---...._.'   `---.'_)    ..  \
     \            `----....___    `. \  |
      `.           _ ----- _   `._  )/  |
        `.       /"  \   /"  \`.  `._   |
          `.    ((O)` ) ((O)` ) `.   `._\
            `-- '`---'   `---' )  `.    `-.
               /                  ` \      `-.
             .'                      `.       `.
            /                     `  ` `.       `-.
     .--.   \ ===._____.======. `    `   `. .___.--`     .''''.
    ' .` `-. `.                )`. `   ` ` \          .' . '  8)
   (8  .  ` `-.`.               ( .  ` `  .`\      .'  '    ' /
    \  `. `    `-.               ) ` .   ` ` \  .'   ' .  '  /
     \ ` `.  ` . \`.    .--.     |  ` ) `   .``/   '  // .  /
      `.  ``. .   \ \   .-- `.  (  ` /_   ` . / ' .  '/   .'
        `. ` \  `  \ \  '-.   `-'  .'  `-.  `   .  .'/  .'
          \ `.`.  ` \ \    ) /`._.`       `.  ` .  .'  /
    LGB    |  `.`. . \ \  (.'               `.   .'  .'
        __/  .. \ \ ` ) \                     \.' .. \__
 .-._.-'     '"  ) .-'   `.                   (  '"     `-._.--.
(_________.-====' / .' /\_)`--..__________..-- `====-. _________)
     
      
      */