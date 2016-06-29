/*
 * Created by BridgeLabz on 09/05/2016.
 * Purpose:Reads a list of words as from keyboard..
	ask the user to enter a word to search the given list.
	if the search word is found in the list or Not ?
	copyrighted by BridgeLabz.
 */
package com.bridgelabz.coding;
import com.bridgelabz.utility.Utility;
public class BinarySearchWord 
{
	//  It is used to do binary search of words present in a string array.
   public static int binarySearch(String[] wordsArray, String key, int lower, int upper) 
   {
       if (lower>upper) 
       {
           return -1;
       }
       int middle=(upper+lower)/2;
       if (wordsArray[middle].equals(key)) 
       {
           return middle;
       } 
       else if(wordsArray[middle].compareTo(key) > 0) 
       {
           return binarySearch(wordsArray,key,lower, middle-1);
       } 
       else 
       {
           return binarySearch(wordsArray,key,middle+1,upper);
       }
   }  
   
   public static void entry(){
	   
	   
   }
	public static void main(String args[])
    {
		Utility u1 = new Utility();
		try
		{
			String temp=null;//It is used to store temporary data.
			System.out.println("Enter the words");
			String words = u1.inputString();
			String wordsArray[]=words.split(",");//remove the commas
			for (int i=0;i<wordsArray.length;i++) //sorting logic
			{
				for (int j=i+1; j<wordsArray.length;j++) 
				{
					if (wordsArray[i].compareTo(wordsArray[j])>0) 
					{
						temp = wordsArray[i];
						wordsArray[i]=wordsArray[j];
						wordsArray[j]=temp;
					}
				}
			}
			System.out.print("Words are in Sorted Order:");
			for (int i=0;i<wordsArray.length;i++) 
			{
				System.out.print(wordsArray[i]+" ");
			}
			System.out.println();
			System.out.println("Ask the user enter the word do you searching");
			String key = u1.inputString();
			int lower=0,upper=wordsArray.length;
			int k=binarySearch(wordsArray,key,lower,upper);
			if(k==-1)
			System.out.println(wordsArray[k]+" not found.");
			else
			{
			int z=k+1;
			System.out.println(wordsArray[k]+" is found at position "+z);
			}
		}//end of try block
		catch (ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Not Found");
		}
   }
}

