/*	Created by BridgeLabz on 09/05/2016.
 * 	Purpose:Computes the prime factorization of N using brute force.
 * 	I/P -> Number to find the prime factors
 * 	copyrighted by BridgeLabz.
 */
package com.bridgelabz.coding;
import com.bridgelabz.utility.Utility;

public class Factors {
public void factorsMethod(){
	
	Utility u1 = new Utility();
	System.out.print("Enter the number: ");
    // command-line argument
	long n =u1.inputInteger();
	System.out.println("=============================================");
	System.out.println("Prime Factors for Given Number" + n + " is:  ");
	System.out.println("=============================================");
   
    
    // for each potential factor i
    for (long i = 2; i*i <= n; i++) {

        // if i is a factor of N, repeatedly divide it out
        while (n % i == 0) {
            System.out.print(i + " "); 
            n = n / i;
        }
    }

    // if biggest factor occurs only once, n > 1
    if (n > 1) 
    	System.out.println(n);
    else       
    	System.out.println();
}
    public static void main(String[] args) { 
    
    	Factors f = new Factors();
    	f.factorsMethod();
    	
    }
}



