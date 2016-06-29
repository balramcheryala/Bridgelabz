/*	Created by BridgeLabz on 09/05/2016.
 * 	Purpose:Flip Coin and print percentage of Heads and Tails..?
 * 	copyrighted by BridgeLabz.
 */
package com.bridgelabz.coding;
public class FlipCoin 
{
	public static void main(String[] args) 
	{
		if(Math.random()<0.5)//Math.random() returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
		{
			System.out.println("Heads");
		}
		else
		{
			System.out.println("Tails");
		}
	}
}
