package com.bridgelabz.utility;
import java.util.Arrays;

public class SortingUtility {
	static Utility u1=new Utility();
	
	  public void Binarysortstr()
	  {
	        		String temp=null;//It is used to store temporary data
	    			int arraysize2=u1.inputInteger();
	    			String[] wordsArray=new String[arraysize2];
	    			for(int i=0;i<wordsArray.length;i++)
	    			{
	    					System.out.print("Enter array["+i+"] : ");
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

		  	}
	  
	  public void BinarysortInt(){
		  System.out.print("Enter array size :");
		  int arraysize1=u1.inputInteger();
	  		Integer[] intArray=new Integer[arraysize1];
	  			for(int i=0;i<arraysize1;i++)
	  				{
	  				System.out.print("Enter array["+i+"] : ");
	  				intArray[i]=u1.inputInteger();
	  				}
	  			
	  			Integer[] inputArray=(Integer[])u1.dataSort(intArray);
	  			
  				System.out.println("...Integers sorting...");
  				for(Integer el:inputArray)
  				{
  					System.out.print(el+" ");
  				}
  				System.out.println();
	  }
	  

	public void Insertionsortint(){
		  	int arraysize1=u1.inputInteger();
		  		Integer[] intArray=new Integer[arraysize1];
		  			for(int i=0;i<arraysize1;i++)
		  				{
		  				System.out.print("Enter array["+i+"] : ");
		  				intArray[i]=u1.inputInteger();
		  				}
		  				Integer[] inputArray=(Integer[])u1.dataSort(intArray);
		  				System.out.println("...Integers sorting...");
		  				for(Integer el:inputArray)
		  				{
		  					System.out.print(el+" ");
		  				}
		  				System.out.println();
	  }
	  
	  public void InsertionsortStr(){
		  int arraysize2=u1.inputInteger();
			String[] inputstring=new String[arraysize2];
			for(int i=0;i<arraysize2;i++)
			{
					System.out.print("Enter array["+i+"] : ");
					inputstring[i]=u1.inputString();
			}
			String[] arrayString=(String[])u1.dataSort(inputstring);
			System.out.println("...Strings sorting...");
			for(String ss:arrayString)
			{
			System.out.print(ss+" ");
			}
			System.out.println();
	  }
	  public void BubblesortInt(){
		  System.out.print("Enter array size :");
		  	int arraysize1=u1.inputInteger();
			Integer[] intArray=new Integer[arraysize1];
			for(int i=0;i<arraysize1;i++)
			{
					System.out.print("Enter array["+i+"] : ");
					intArray[i]=u1.inputInteger();
			}
			Integer[] inputArray=(Integer[])u1.elementSort(intArray);
			System.out.println("...Integers sorting...");
			for(Integer el:inputArray)
			{
				System.out.print(el+" ");
			}
			System.out.println();
	  }
	  
	  public void Bubblesortstr(){
		  int arraysize2=u1.inputInteger();
			String[] inputstring=new String[arraysize2];
			for(int i=0;i<arraysize2;i++)
			{
					System.out.print("Enter array["+i+"] : ");
					inputstring[i]=u1.inputString();
			}
			String[] arrayString=(String[])u1.elementSort(inputstring);
			System.out.println("...Strings sorting...");
			for(String ss:arrayString)
			{
			System.out.print(ss+" ");
			}
			System.out.println();
	  }
}

