/*
 * Created by BridgeLabz on 09/05/2016.
 * Purpose:User Input and Replace String Template “Hello <<UserName>>, How are you?” 
 * copyrighted by BridgeLabz.
 */
package com.bridgelabz.coding;
import java.util.Arrays;
import com.bridgelabz.utility.Utility;

public class Anagram{ 
	
static void isAnagram(String s1, String s2)
    {
        //Removing all white spaces from s1 and s2
 
        String name1 = s1.replaceAll("\\s", "");
 
        String name2 = s2.replaceAll("\\s", "");

        //Initially setting status as true
 
        boolean status = true;
 
        if(name1.length() != name2.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
 
            status = false;
        }
        else
        {
            //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array
 
            char[] s1Array = name1.toLowerCase().toCharArray();
 
            char[] s2Array = name2.toLowerCase().toCharArray();
 
            //Sorting both s1Array and s2Array
 
            Arrays.sort(s1Array);
 
            Arrays.sort(s2Array);
 
            //Checking whether s1Array and s2Array are equal
 
            status = Arrays.equals(s1Array, s2Array);
        }
 
        //Output
 
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
 
    public static void main(String[] args)
    {
    Utility<Object> u1 = new Utility<Object>(); // Creating Object to The Utility Class
 	System.out.println("Enter The First String Name");
	String s1 =u1.inputString();
 	System.out.println("Enter The Second String Name");
 	String s2 =u1.inputString();
	isAnagram(s1, s2);  // calling method

    }
}



        
