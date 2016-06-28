/*	Created by BridgeLabz on 09/05/2016.
 * 	Reads in strings from keyboard.
 * 	prints them in sorted order by using insertion sort.
 * 	copyrighted by BridgeLabz.
 */
package com.bridgelabz.coding;
import com.bridgelabz.utility.Utility;
public class InsertionSort 
{
	public static void insertionSort(String array[])//method1
			{
				int n=array.length;
				for (int j=1;j<n;j++) 
					{
						String key=array[j];
						int i=j-1;
						while((i>=0))
						{
							if (key.compareTo(array[i])>0) 
								{
									break;
								}
								array[i + 1]=array[i];
								i--;
							}
								array[i + 1]=key;
					}
						printWords(array);
			}
			//displaying the results
	public static void printWords(String[] input) 
			{
					System.out.println("=============================");
					System.out.println("==Insertion Sort of Strings===");
					System.out.println("=============================");
					for(int i=0;i<input.length;i++)
					{
						System.out.print(input[i] + " ,");
					}
					System.out.println("\n");
					System.out.println("=============================");
			}
	public static void main(String[] args) 
	{
		
		Utility u1 = new Utility();
		// read in a sequence of words from keyboard
		
		System.out.print("Enter the size of String Array :");
		//asking the user how many wards you want
		int size=u1.inputInteger();
        String names[]=new String[size];
        for (int i=0;i<names.length;i++)
			{
				System.out.print("Enter "+(i+1)+" String Words :");
				names[i]=u1.inputString();
			}
			System.out.println("======Before Sort Words===============");
			for(int i=0;i<names.length;i++)
			{
				System.out.print(names[i]+",");
			}
			System.out.println();
			insertionSort(names);//this is caling method1 to pass arguments
    }
}
