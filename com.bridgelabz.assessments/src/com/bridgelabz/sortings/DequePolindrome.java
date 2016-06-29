/*
*Created by :BridgeLabz
*Perpose: A palindrome is a string that reads the same forward and backward.
*for example, radar, toot, and madam. 
*We would like to construct an algorithm to input a string of characters
*check whether it is a Palindrome
* this BubbleSort program is Generic type.
* copyrighted by BridgeLabz.
*/
package com.bridgelabz.sortings;
import com.bridgelabz.utility.Polindromeutility;
import com.bridgelabz.utility.Utility;
public class DequePolindrome {

	   public static  void Polindrome()
	    {
		   Utility u1= new Utility();
	       	Polindromeutility<Character> deqobj =new Polindromeutility<Character>();
	        System.out.println("Enter a String to Check Polyndrome");
	        String checkString = u1.inputString();
	        for(int i=0; i<checkString.length();i++)
	        {
	            char c = checkString.charAt(i);
	            deqobj.addRear(c);
	        }
	        int count=0;
	        while(deqobj.size() > 1)
	        {
	            if(deqobj.removeFront() != deqobj.removeRear())
	            {
	                count++;
	                break;
	            }
	        }
	        if(count==0)
	        {
	            System.out.println("String is Polyndrome");
	        }
	        else
	        {
	            System.out.println("String is Not Palindrome");
	        }
	    }

			public static void main(String [] args){
				DequePolindrome.Polindrome();
	}
	

	}
