/*	Created by BridgeLabz on 09/05/2016.
 *  Java Program to Check for balanced parenthesis by using Stacks.
 *  copyrighted by BridgeLabz.
 */
 
package com.bridgelabz.coding;
import com.bridgelabz.utility.Utility;
import java.util.Stack;
public class ParenthesisMatching{
        
	public void method(){
		Utility u1 = new Utility();

        /* Creating Stack */

      Stack<Integer> stk = new Stack<Integer>(); // This constructs a newly allocated Integer object that represents the specified int value.

      System.out.println("Enter expression for Parenthesis Matching Test\t\n");

         /* Accepting expression */
         String exp = u1.inputString();

         for (int i = 0; i < exp.length(); i++)          // Logic

         {
             char ch = exp.charAt(i);

             if (ch == '(')

                 stk.push(i);

             else if (ch == ')')

             {

                 try

                 {
                  stk.pop();

                 }
                 catch(Exception e)

                 {

                     System.out.println(e);

                 }

             }

         }

        if(stk.isEmpty())
        {
     	   	System.out.println("Balanced Paranthesis");
     	   
        }
        
        else{
     		   System.out.println("Not Balanced Parenthesis");

        		}

		
	}
    	
	public static void main(String[] args){
		ParenthesisMatching pm = new ParenthesisMatching();
		pm.method();
    		
    }
}