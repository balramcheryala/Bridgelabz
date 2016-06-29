/*
	Created by BridgeLabz on 09/05/2016.
	Purpose:ask the user what type element you wants,you can sort the integers,strings and doubles.
	you can search the word or integer or double in the array.if it is found show the position.
	This BinarySearch program is Generic type.
*/

package com.bridgelabz.sortings;
import com.bridgelabz.utility.Utility;
public class BinarySearch
{
	static Utility u1=new Utility();
  public void sort()
  {
	  	try
	  		{
	  		String temp=null;//It is used to store temporary data.
          
    		//ask the user what type of data you wants
          		System.out.println("Enter Any Type of Data That You Want");
    			System.out.print("Enter array size :");
    			int arraysize2=u1.inputInteger();
    			String[] wordsArray=new String[arraysize2];
    			for(int i=0;i<wordsArray.length;i++)
    			{
    					System.out.print("Enter the No: ["+i+"] : ");
    					wordsArray[i]=u1.inputString();
    			}
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
    			u1.printArray(wordsArray);
          System.out.print("Enter a searching word in the array :");
    			String key=u1.inputString();
    			Integer lower=0,upper=wordsArray.length;
          Integer k=(u1.binarySearch(wordsArray,key,lower,upper));
          //int k=ks.intValue();
    			if(k==-1)
    			System.out.println(wordsArray[k]+" not found.");
    			else
    			{
    			int z=k+1;
    			System.out.println(wordsArray[k]+" is found at position "+z);
    			}
    			System.out.println();
    }//end of try
    catch(NumberFormatException nfe)
    {
      System.out.println("try to enter numbers only");
    }
  catch (ArrayIndexOutOfBoundsException ae)
  {
    System.out.println("Not Found");
  }
  catch(ClassCastException c )
  {
    System.out.println(c);
  }
}
	 public static void main(String[] args)
	  {
		    BinarySearch is=new BinarySearch();
		                  is.sort();
    }
}
