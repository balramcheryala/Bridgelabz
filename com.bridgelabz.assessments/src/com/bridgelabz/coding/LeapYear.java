/*	Created by BridgeLabz on 09/05/2016.
 * 	Purpose:Check the year is a Leap Year or not
 * 	copyrighted by BridgeLabz.
 */
package com.bridgelabz.coding;
import com.bridgelabz.utility.Utility;
public class LeapYear
{
	
	
	public void LeapLogic(){
		Utility u1 = new Utility();
		// reading input from keyboard
		
		//asking the user to enter 4 digit number
		System.out.print("Enter any year :");
		
		//taking 4 digit number
		int year=u1.inputInteger();
		
		//checking condition on year
		if((year%400==0)||(year%4==0)&&(year%100!=0))
		
		{
			System.out.println(year+ " is Leap Year");
		}
		
		else
		
		{
			System.out.println(year+ " is not Leap Year");
		}
	}
	public static void main(String[] args) 
	{
		LeapYear ly = new LeapYear();
		ly.LeapLogic();
		
	}
} 