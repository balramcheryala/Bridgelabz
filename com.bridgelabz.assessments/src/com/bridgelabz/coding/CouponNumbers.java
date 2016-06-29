/*	Created by BridgeLabz on 09/05/2016.
 * 	Purpose:how many random numbers you need to generate distinct coupon number ?
 * 	copyrighted by BridgeLabz.
 */
package com.bridgelabz.coding;
import com.bridgelabz.utility.Utility;
public class CouponNumbers
{
	public static void main(String[] args) 
	{
		Utility u1 = new Utility();
		// reading the input from keyboard
		System.out.print("Enter any number :");
		int s = u1.inputInteger();
		//ask the use how many distinct number you want
		
		int []randomNumbers=new int[s];
		for(int i=0;i<randomNumbers.length;i++)
		{
			randomNumbers[i]=(int)(Math.random()*100);//this method generate random numbers
		}
		//display the output
		for(int j=0;j<randomNumbers.length;j++)
		{
			System.out.println(randomNumbers[j]);
		}
	}
}
