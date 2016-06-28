package com.bridgelabz.sortings;
import com.bridgelabz.utility.SortingUtility;
import com.bridgelabz.utility.Utility;
public class SortingSwitch{
	
	public void sorting()
	{
			//ask the user what type of data he wants
			System.out.println("Please Enter Your Choice");
			System.out.println();
			System.out.println("[1] BinarySearch method for Integer");
			System.out.println("[2] BinarySearch method for String");
			System.out.println("[3] InsertionSort method for integer");
			System.out.println("[4] InsertionSort method for String");
			System.out.println("[5] BubbleSort method for integer");
			System.out.println("[6] BubbleSort method for String");
			System.out.println( );
			
	}
	public static void main(String [] args){
		long startTime ;
		long endTime ;
		long totalTime ;
		Utility u1 = new Utility();
		SortingUtility su = new SortingUtility();
		SortingSwitch sc = new SortingSwitch();
		
		sc.sorting();
		
		int choice=u1.inputInteger();
		switch(choice)
		{
		case 1:
			System.out.print("Enter array size :");
			startTime = System.currentTimeMillis();
			su.BinarysortInt();
            endTime   = System.currentTimeMillis();
            totalTime = (endTime - startTime)/1000;
            System.out.println("TotalTime Elapsed to Execute the Function in Seconds: : "+totalTime);
			
			break;
		
		case 2:
			System.out.print("Enter array size :");
			startTime = System.currentTimeMillis();
			su.Binarysortstr();
            endTime   = System.currentTimeMillis();
            totalTime = (endTime - startTime)/1000;
            System.out.println("TotalTime Elapsed to Execute the Function in Seconds: : "+totalTime);
			
			break;
			
		case 3:
			System.out.print("Enter array size :");
			startTime = System.currentTimeMillis();
			su.Insertionsortint();
            endTime   = System.currentTimeMillis();
            totalTime = (endTime - startTime)/1000;
            System.out.println("TotalTime Elapsed to Execute the Function in Seconds: "+totalTime);
			
			break;
			
		case 4:	
			System.out.print("Enter array size :");
			startTime = System.currentTimeMillis();
			su.InsertionsortStr();
            endTime   = System.currentTimeMillis();
            totalTime = (endTime - startTime)/1000;
            System.out.println("TotalTime Elapsed to Execute the Function in Seconds: "+totalTime);
			
			break;
			
		case 5:	
			System.out.print("Enter array size :");
			startTime = System.currentTimeMillis();
			su.BubblesortInt();
            endTime   = System.currentTimeMillis();
            totalTime = (endTime - startTime)/1000;
            System.out.println("TotalTime Elapsed to Execute the Function in Seconds: "+totalTime);
			su.BubblesortInt();
			break;
			
		case 6:	
			System.out.print("Enter array size :");
			startTime = System.currentTimeMillis();
			su.Bubblesortstr();
            endTime   = System.currentTimeMillis();
            totalTime = (endTime - startTime)/1000;
            System.out.println("TotalTime Elapsed to Execute the Function in Seconds: "+totalTime);
		
			break;
			
			
		}
	}
}

