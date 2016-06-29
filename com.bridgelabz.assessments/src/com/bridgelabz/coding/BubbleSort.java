/*Created by BridgeLabz on 09/05/2016.
 * Purpose:Reads in integers prints them in sorted order using Bubble Sort
	copyrighted by BridgeLabz.
 * 
 */
package com.bridgelabz.coding;
import java.util.Scanner;
public class BubbleSort
{
	public static void main(String[] args) 
	{
		int n,i,j;
		// reading the input from keyboard
		Scanner s=new Scanner(System.in);
		// ask the user enter size of array length
		System.out.print("Enter how many numbers you want :");
		n=Integer.parseInt(s.nextLine());
		int a[]=new int[n];
		for(i=0;i<n;i++)//for loop used reading numbers
		{
			System.out.print("enter "+(i+1)+" value :");
			a[i]=Integer.parseInt(s.nextLine());
		}
		//before sorting array elements printing
		System.out.println("===========================");
		System.out.println("Before Sorting");
		System.out.println("===========================");
		for(i=0;i<n;i++)
		{

			System.out.print(" "+a[i]);
		}
		System.out.println();
		System.out.println("===========================");
		for(i=0;i<n;i++)//total number of elements length find out
		{
			for(j=0;j<n-i-1;j++)//comparing adjecent elements with length
			{
				if(a[j]>a[j+1])//check the condition on 0th element with adjecent elements
				{
					//swaping the elements
					int t=a[j];
						a[j]=a[j+1];
						a[j+1]=t;
				}
			}
		}
		//displays the results
		System.out.println("Bubble sort");
		System.out.println("===========================");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println();
		System.out.println("===========================");
	}
}
