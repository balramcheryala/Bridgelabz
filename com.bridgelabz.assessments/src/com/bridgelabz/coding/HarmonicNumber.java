/*	Created by BridgeLabz on 09/05/2016.
 * 	Purpose:Print the Nth HarmonicNumber value ?
 * 	copyrighted by BridgeLabz.
 */
package com.bridgelabz.coding;
import com.bridgelabz.utility.Utility;

public class HarmonicNumber 
{ 
	
	public void harmonicMethod(){
    	Utility u1 = new Utility();
		//reading input from keyboard
    	System.out.print("Which Number u want :"); //asking user enter any number
        int Num = u1.inputInteger();
        // To compute Nth HarmonicNumber 1/1 + 1/2 + 1/3 + ... + 1/N
        
        double sum = 0.0;
        
        for (int i=1;i<=Num;i++)
			{
            sum=sum+(1.0/i);
			}
        // display the result of the number of Harmonic series Sum
        System.out.println(sum);
	}
	
    public static void main(String[] args)
	{ 
    	HarmonicNumber hn = new HarmonicNumber();
    	hn.harmonicMethod();
    	
    	
    }
}
