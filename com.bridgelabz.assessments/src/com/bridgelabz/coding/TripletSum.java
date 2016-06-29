/*	Created by BridgeLabz on 09/05/2016.
 *	Read the in N integers and counts the number of triples that sum to exactly 0 ?. 
 * 	copyrighted by BridgeLabz.
 */
package com.bridgelabz.coding;
import com.bridgelabz.utility.Utility;
public class TripletSum
{
	int checkSum(int b[],int length)//method 1
	{
		System.out.println("========================");
		int i,j,k,count=0;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				for(k=j+1;k<length;k++)
				{
					// printing distinct triples (i, j, k) where a[i] + a[j] + a[k] = 0
					if (b[i] + b[j] + b[k] == 0)
						{
						 System.out.println(b[i] + " " + b[j] + " " + b[k]);
						 count++;
						}
				}
			}
		}
		// return number of distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
		return count;
	}		
	public static void main(String[] args) 
	{
		Utility u1 = new Utility();
		//read input from keyboard
		//enter the array size
		System.out.print("Enter Size of Array :");
		int size=u1.inputInteger();
		int arr[]=new int [size];//create array & read values one by one
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Value :");
			arr[i]=u1.inputInteger();
		}
		TripletSum t1=new TripletSum();
		int sum=t1.checkSum(arr,size);//pass the arguments to method 1
		System.out.println("========================");
		System.out.println("No.of Tripltes :"+sum);
		System.out.println("=======================");
		
	}
}
