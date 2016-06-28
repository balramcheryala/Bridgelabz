/*
*	Created by :BridgeLabz
*	Perpose:ask the user what type element you wants,sort the integers,strings and doubles.
* 	this InsertionSort program is Generic type.
*	copyrighted by BridgeLabz
*/

package com.bridgelabz.sortings;

import com.bridgelabz.utility.Utility;
public class InsertionSort
{
	public void sorting()
	{
		Utility u1=new Utility();
		//ask the user what type of data he wants
		System.out.println("Please Enter Your Choice");
		System.out.println();
		System.out.println("Choose 1 for integers data");
		System.out.println("Choose 2 for strings data");
		System.out.println("Choose 3 for doubles data");
		int choice=u1.inputInteger();
		switch(choice)
		{
			case 1:
			System.out.print("Enter array size :");
		  	int arraysize1=u1.inputInteger();
			Integer[] intArray=new Integer[arraysize1];
			for(int i=0;i<arraysize1;i++)
			{
					System.out.print("Enter the No: ["+i+"] : ");
					intArray[i]=u1.inputInteger();
			}
			Integer[] inputArray=(Integer[])u1.dataSort(intArray);
			System.out.println("...Integers sorting...");
			for(Integer el:inputArray)
			{
				System.out.print(el+" ");
			}
			System.out.println();
			break;
			case 2:
			System.out.print("Enter array size :");
			int arraysize2=u1.inputInteger();
			String[] inputstring=new String[arraysize2];
			for(int i=0;i<arraysize2;i++)
			{
					System.out.print("Enter the No: ["+i+"] : ");
					inputstring[i]=u1.inputString();
			}
			String[] arrayString=(String[])u1.dataSort(inputstring);
			System.out.println("...Strings sorting...");
			for(String ss:arrayString)
			{
			System.out.print(ss+" ");
			}
			System.out.println();
			break;
			case 3:
			System.out.print("Enter array size :");
			int arraysize3=u1.inputInteger();
			Double[] inputdouble=new Double[arraysize3];
			for(int i=0;i<arraysize3;i++)
			{
					System.out.print("Enter the No: ["+i+"] : ");
					inputdouble[i]=u1.inputDouble();
			}
			Double[] arrayDouble=(Double[])u1.dataSort(inputdouble);
			for(Double dd:arrayDouble)
			{
			System.out.print(dd+" ");
			}
			System.out.println();
			break;
		}//end switch
	}
	public static void main(String[] args)
	{
		InsertionSort is=new InsertionSort();
		is.sorting();
  }
}
