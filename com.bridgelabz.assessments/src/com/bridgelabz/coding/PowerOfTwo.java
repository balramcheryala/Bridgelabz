/*	Created by BridgeLabz on 09/05/2016.
 *	prints a table of the powers of 2 that are less than or equal to 2^N. 
 * 	copyrighted by BridgeLabz.
 */
package com.bridgelabz.coding;
import com.bridgelabz.utility.Utility;
public class PowerOfTwo 
{
	
	public void ptMethod(){
		
		Utility u1 = new Utility();
		try
		{
		//reading the command line argument
		int Number=u1.inputInteger();//accepting the value from user
		int i=0;//Initial count=0
		int powerOfTwo=1;//calculating up to ith power of two
		//repeat loop until i equals to Number
		while(i<=Number)
		{
			if(Number>30)//check condition number more than 30 we get Overflow error
			{
				System.out.println("Overflow an int");
				break;
			}
			else
			{
				System.out.println(i+ " "+powerOfTwo);// printing out the power of two
				powerOfTwo=2*powerOfTwo;		//double to get the next one
				i=i+1;		//increment i values	& check condition of loop
			}	
		}
		}
		catch (ArrayIndexOutOfBoundsException ae)//exception handling
		{
			System.out.println("try to enter value at runtime only");
		}
	}
	public static void main(String[] args) 
	{
		PowerOfTwo pm = new PowerOfTwo();
		pm.ptMethod();
		
	}
}
