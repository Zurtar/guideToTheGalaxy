/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem_2_10;

import static java.lang.Math.*;

/**
 *
 * @author theda
 */
public class Largest_prime_factor {

    public static void main(String[] args) {
        sieve(231);
    }

    //latest update; Our function is overl complex and cant handle as high 
    //of  a number that we need it to but it can find all the prime numbers up to
    //n our argument. right now its tweaked to just show us the largest one to save space
    /*

    
    //GOTTA HANDLE AN INPUT of... 10  trillion dollars!

What is the largest prime factor of the number 600851475143 ?
    
    Prime numbers: 2, 3, 4, 5, 7, 11, 13, 17, 19, 23, 31, 37, 41, 43, 47, 53
    Really dont have any solid ideas about how to tackle this problem
    -if square root maybe theres a shortcut seems to be when solving anyways
    
    
    Day 2:
    
    we dont need to find al the prime factors of a number we just need to find
        the largest prime factor that x is divisible by and we have out anwer
    now we just need a low footprint way to get all the prime numbers making a
    list is out of consideration of course because of the crazy amount of space
    and time it would take
    
    we could have a for loop counting divide i by i
    
    http://mathforum.org/library/drmath/view/54371.html Just read doctor pauls
    first respone and we should be set to crack this
    
    Day:3 
    
    "Sift the Two's and Sift the Three's,
The Sieve of Eratosthenes.
When the multiples sublime,
The numbers that remain are Prime."
    
    
    
     */
    //SCRAP
//MY FRIEND THIS IS TRASH AND ISNT GOOD FOR OUT PROBLEM BUT HEY ITS A START
    //doesnt work up to as large of a number as we want
    static void sieve(int upperbound) {

        boolean composite[] = new boolean[upperbound];
        composite[0] = true;
        composite[1] = true;
        double largestPrime = 0;
        if (upperbound < 2) {
            System.exit(0);
        }
        for (int i = 2; i * i < upperbound; i++) {
            if (composite[i] != true) {
                for (int j = i * i; j < upperbound - 1; j += i) { //j+=i gives us the next exponent each time i^2,i^3 and so on
                    composite[j] = true;
                }
            }
        }
        //sieve end
        for (int z = 0; z < upperbound && upperbound % z == 0; z++) {
            if (composite[z] == false && z > largestPrime && upperbound % z == 0) {
                largestPrime = z;
            }
        }
        System.out.println("largest prime factor of " + upperbound + ": " + largestPrime);
    }
}


/*nothing works nothing works but everything will work in time fuck
/woo! 
if n%i == 0 {prime=false}
 */
// Sieve
/*
      for (int i = 2; i*i < upperbound; i++) {
            if (composite[i] != true) {
                for (int j = i*i; j < upperbound - 1; j += i) { //j+=i gives us the next exponent each time i^2,i^3 and so on
                    composite[j] = true;
                }
            }
        }'
 */
