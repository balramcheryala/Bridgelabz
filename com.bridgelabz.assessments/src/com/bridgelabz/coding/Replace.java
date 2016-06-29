/*	Created by BridgeLabz on 09/05/2016.
 *	User Input and Replace String Template “Hello <<UserName>>, How are you?”
 * 	copyrighted by BridgeLabz.
 */

package com.bridgelabz.coding;
import com.bridgelabz.utility.Utility;

public class Replace {
 
    public static void main(String[] args) {
    	
    Utility u1 = new Utility();
    System.out.println("Enter Your Name");
	String scan = u1.inputString();
	
	if (scan.length()>=3){
       
        System.out.println("Hello "+scan+" ,How are you?");
}
	else 
	{
	System.out.println("Please enter Atleast 3 Letters");		
	}
    }

}


