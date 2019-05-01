/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Zurtar
 */
public class J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int adjCount, nounCount;
        adjCount = in.nextInt();
        nounCount = in.nextInt();
        in.nextLine();
        String adj[]= new String[adjCount];
        String nouns[] = new String[nounCount];

        
            for (int i = 0; i < Math.abs((adjCount-nounCount)); i++) {
                list[j][i] = in.nextLine();
            }

    }
    /*
            Scanner in = new Scanner(System.in);
        String plaintext, cipherEx, code;
        plaintext = in.nextLine();
        cipherEx = in.nextLine();
        code = in.nextLine();

        for (int i = 0; i < code.length(); i++) {
            int index = cipherEx.indexOf(code.charAt(i), 0);
            if (index != -1) {
                System.out.print(plaintext.charAt(index));
            } else {
             System.out.print('.');
            }
        }
    
    new thing::::::::::::::::::::
            Scanner in = new Scanner(System.in);
        int length = Integer.parseInt(in.nextLine());
        char a[][] = new char[2][length];
        for (int i = 0; i < length; i++) {
            a[0][i] =(char) in.nextInt();
            a[1][i] = in.next().trim().charAt(0);
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < a[0][i]; j++) {
                System.out.print((char) a[1][i]);
            }
            System.out.println();
        }
        
        
        
       
     */
}
