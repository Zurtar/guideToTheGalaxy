/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currentfastest2016s5solution;

/**
 *
 * @author Zurtar
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        //long testcases = 1;
        //System.out.println("Total Elapsed Time For " + testcases + " Runs: " + s5_2016Debug(testcases));
        int[][] b = s5_2016();
        for (int i = 0; i < b[0].length; i++) {
            System.out.print(b[0][i]);
        }
    }

    /**
     * DEBUG - to set this up correctly we have to still grab the input as we
     * normaly would because that takes time! and if we remove that component it
     * wont show how much time we \ eh you know what these operations are run
     * once compared to the 10 000 000 times everything else is run so fuck it
     * the time will be off by a bit but not enougj to make it useless to debug
     * this way
     */
    public static double s5_2016Debug(long testcases) throws IOException {
        /**
         * public static void main(String[] args) throws IOException { long
         * testcases = 1; System.out.println("Total Elapsed Time For
         * "+testcases+" Runs: "+s5_2016Debug(testcases)); } // main function
         * for debuggings
         */
         
        long totalRunTime = 0;
        long DataCollectionStart = System.nanoTime();
        Random Random = new Random();
        int n = 2432;
        long t = 700000;
        int[][] a = new int[2][n];
        a[0] = Random.ints(n, 0, 2).toArray();
        a[1] = a[0].clone();
        long listGeneratorEnd_AlgorithimBegins = System.nanoTime();

        long totalrunTime = 0;
        for (long z = 0; z < testcases; z++) {
            long runTimeCurrent = System.nanoTime();
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

            /**
             * Execution Results
             *
             * Test case #1:	AC	[0.168s,	27.16 MB]	(0/0) Test case #2:	AC
             * [0.215s, 27.15 MB]	(0/0) Test case #3:	AC	[0.188s,	27.42 MB]
             * (1/1)
             *
             * Batch #4 (0/6 points) Case #1:	AC	[1.731s,	31.14 MB] Case #2:	TLE
             * [>3.000s,	30.08 MB] Case #3:	— Case #4:	— Case #5:	— Case #6:	—	*
             * Batch #5 (0/4 points) Case #1:	AC	[0.185s,	27.80 MB] Case #2:	TLE
             * [>3.000s,	30.34 MB] Case #3:	— Case #4:	—	* Batch #6 (0/4 points)
             * Case #1:	TLE	[>3.000s,	30.82 MB] Case #2:	— Case #3:	— Case #4:	—
             * *
             *
             * Resources: ---, 31.14 MB Final score: 1/15 (1.333/20 points)
             */
            long runtimeEnd = System.nanoTime();
            totalrunTime += runtimeEnd - runTimeCurrent;
        }
        double finalTime = (((double) totalrunTime / 1000000000.0) / testcases) + ((listGeneratorEnd_AlgorithimBegins - DataCollectionStart) * testcases) / 1000000000.0;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[0][i] + "  ");
        }
        return (finalTime);
    }

    //bench marking is boring but hey!
    //*  *Current Fastest* Int array and BufferedReader 
    public static int[][] s5_2016() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        long t = Long.parseLong(st.nextToken());
        String temp = in.readLine();

        int[][] a = new int[2][(int) n]; //our array that is size n (had to cast n to a int because it was a long data type)

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
        /**
         * Execution Results
         *
         * Test case #1:	AC	[0.168s,	27.16 MB]	(0/0) Test case #2:	AC	[0.215s,
         * 27.15 MB]	(0/0) Test case #3:	AC	[0.188s,	27.42 MB]	(1/1)
         *
         * Batch #4 (0/6 points) Case #1:	AC	[1.731s,	31.14 MB] Case #2:	TLE
         * [>3.000s,	30.08 MB] Case #3:	— Case #4:	— Case #5:	— Case #6:	—	*
         * Batch #5 (0/4 points) Case #1:	AC	[0.185s,	27.80 MB] Case #2:	TLE
         * [>3.000s,	30.34 MB] Case #3:	— Case #4:	—	* Batch #6 (0/4 points)
         * Case #1:	TLE	[>3.000s,	30.82 MB] Case #2:	— Case #3:	— Case #4:	—	*
         *
         * Resources: ---, 31.14 MB Final score: 1/15 (1.333/20 points)
         */
    }

    //Scanner Instead of BufferedReader
    public static int[][] s5_2016Scanner() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long t = in.nextLong();
        String temp = in.nextLine();
        int[][] a = new int[2][(int) n]; //our array that is size n (had to cast n to a int because it was a long data type)

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
        /**
         * Execution Results
         *
         * Test case #1:	AC	[0.227s,	28.41 MB]	(0/0) Test case #2:	AC	[0.224s,
         * 28.47 MB]	(0/0) Test case #3:	AC	[0.228s,	28.47 MB]	(1/1)
         *
         * Batch #4 (0/6 points) Case #1:	AC	[2.024s,	32.23 MB] Case #2:	TLE
         * [>3.000s,	31.32 MB] Case #3:	— Case #4:	— Case #5:	— Case #6:	—	*
         * Batch #5 (0/4 points) Case #1:	AC	[0.224s,	28.85 MB] Case #2:	TLE
         * [>3.000s,	31.32 MB] Case #3:	— Case #4:	—	* Batch #6 (0/4 points)
         * Case #1:	TLE	[>3.000s,	31.32 MB] Case #2:	— Case #3:	— Case #4:	—	*
         *
         * Resources: ---, 32.23 MB Final score: 1/15 (1.333/20 points)
         */
    }

//Chhar Array Instead of Int
    public static char[][] s5_2016Char() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        long t = Long.parseLong(st.nextToken());
        String temp = in.readLine();

        char[][] a = new char[2][(int) n]; //our array that is size n (had to cast n to a int because it was a long data type)

        for (int z = 0; z < n; z++) {
            a[0][z] = temp.charAt(z);
        }
        for (int j = 0; j < t; j++) { //this loop is for generations
            for (int i = 0; i < a[1].length; i++) {

                try {
                    if (a[0][i - 1] == '1' ^ a[0][i + 1] == '1') {
                        a[1][i] = '1';
                    } else {
                        a[1][i] = '0';
                    }
                } catch (ArrayIndexOutOfBoundsException error) {
                    if (i == 0) {
                        if (a[0][i + 1] == '1' ^ a[0][a[1].length - 1] == '1') {
                            a[1][i] = '1';
                        } else {
                            a[1][i] = '0';
                        }
                    } else {
                        //last index!
                        if (a[0][i - 1] == '1' ^ a[0][0] == '1') {
                            a[1][i] = '1';
                        } else {
                            a[1][i] = '0';
                        }
                    }
                }
            }
            a[0] = a[1].clone();
        }
        return (a);
        /*Execution Results
Test case #1:	AC	[0.173s,	27.08 MB]	(0/0)
Test case #2:	AC	[0.166s,	27.00 MB]	(0/0)
Test case #3:	AC	[0.193s,	27.11 MB]	(1/1)

Batch #4 (0/6 points) 
Case #1:	AC	[2.321s,	31.11 MB]
Case #2:	TLE	[>3.000s,	30.53 MB]
Case #3:	—		
Case #4:	—		
Case #5:	—		
Case #6:	—		
 
Batch #5 (0/4 points) 
Case #1:	AC	[0.182s,	27.67 MB]
Case #2:	TLE	[>3.000s,	30.30 MB]
Case #3:	—		
Case #4:	—		
 
Batch #6 (0/4 points) 
Case #1:	TLE	[>3.000s,	30.79 MB]
Case #2:	—		
Case #3:	—		
Case #4:	—		
 

Resources: ---, 31.11 MB 
Final score: 1/15 (1.333/20 points) 
         */
    }
}

/**
 * so at this point we are just banging our head against a wall hoping that a
 * magical runtime fairy will come down and give us our solution i dont mind
 * running into problems when I have a vague idea about how to solve them even
 * if that idea is completely wrong it usually leads to others but right now i
 * have nothing man like not a clue I feel like after this amount of time im
 * stuck thinking about the program in one way and struggling to even consider
 * other ways to do it. I don't have may third parties I can submit this to and
 * get some feedback on optimization but right now my biggest option is stack
 * overflow im not sure if they handle code optimization. its worth a shot
 *
 * what about an algorithm that checks if a cell is dead or alive after each
 * individual status of any given cell we must know the life status of the cells
 * beside it. that is why we would start at 3 im thinking something recursive
 * having us append a 1 or 0 to a string depending on the alive status
 *
 * this would remove the extra time it takes to write the input list of 1s and
 * 0s to and array then checking them this way we safe a few for loops but I
 * have no idea how to write it thankfully the checking part would remain mostly
 * the same as far as I can tell but I doubt that will hold true once I start
 * messing with it. thing is I know once I head home I will get nothing done and
 * my work spaces are taken up at school and my computer will die soon so yeah
 * issues
 *
 * also we would only have to use one string/maybe a temp one as well instead of
 * the 2d array beacuse a string of
 */
