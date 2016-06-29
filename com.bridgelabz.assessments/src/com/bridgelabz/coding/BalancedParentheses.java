/*
 * Created by BridgeLabz on 09/05/2016.
 * Purpose:Take an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3). 
  			where parentheses are used to order the performance of operations. 
  			Ensure parentheses must appear in a balanced fashion.
 * copyrighted by BridgeLabz.
 */
package com.bridgelabz.coding;
import com.bridgelabz.utility.Utility;
import java.util.Stack;
public class BalancedParentheses

    {
	static Utility	u1 = new Utility();
	
        public static void main(String[] args)
        {
        	/* Creating Stack */

         Stack<Integer> stk = new Stack<Integer>();

         System.out.println("Parenthesis Matching Test\n");

            /* Accepting expression */

            System.out.println("Enter expression");

            String exp =u1.inputString();
            int len = exp.length();

            for (int i = 0; i < len; i++)          // Logic

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
                System.out.println("paranthes are  Balanced");
          }
          
          else
          {
        	  System.out.println("paranthes are not Balanced");
          }
        }

    }
