package com.bridgelabz.unordered;
/*
	*	Created by bridgeLabz on 20/5/16.
	* 	<p>
 	* 	Purpose:
	*	1.read the string from the file
	*	2.search the word
	*	3.if search found delete from the file
	*	4.if not add the word  
*/
import java.util.*;
import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;

public class UnorderedList
{  
     List<String> ls=new LinkedList<String>();
	int mcount=0;
	String muser,msearch;
	Scanner in =new Scanner(System.in);
    public void userInput()
	{
		try 
		{
			FileReader fileReader = new FileReader("/home/bridgeit007/Documents/com.bridgelabz.assessments/file.txt");//reading the file form the   given path
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;

			/*checking whether the file is empty or not*/
			while ((line = bufferedReader.readLine()) != null) 
			{
				stringBuffer.append(line);//appending line to a string
				stringBuffer.append("\n");
			}//end of while
			fileReader.close();//close the file
			System.out.println("Contents of file:");
			String muser=stringBuffer.toString();//fetching the value from the file and storing in variable
			System.out.println(muser);
			splitWorld(muser);//calling splitWorld method and passing the parameter  
		} //end of try
		catch (IOException e) 
		{
			e.printStackTrace();
		}//end of catch
	
	}//end of userinput
	
	/*use to split the string*/
	public void splitWorld(String muser)
	{
		String []split=muser.split("\\s");//spliting the string and storing in to an array 
		/*for loop to split the word*/
		for(String usplit:split)
		{
			System.out.println(usplit);
		}//end of for
		search( split);//calling the search method and passing parameter
	}//end of splitworld
	
	/*use to find whether the given string is present or not*/
	public void search(String []split)
	{
		/*creating the array list object*/
		
		/*for loop to add the item in array list*/
		for(int i=0;i<split.length;i++)
		{
			ls.add(split[i]);
			//Collections.sort(ls);
		}//end of for
		System.out.println("enter word to be search");
		msearch=in.next();
		/*for loop to search whether the given input present or not*/
		for(int i=0;i<split.length;i++)
		{
			/*if condition to compare the value*/
			if(split[i].equals(msearch))
			{
				System.out.println("Word found.So,now deleting the word and displaying the list and saving the changes in the file.");
				deleteList(ls,msearch);//calling delete method
				mcount=1;
					
			}//end of if
		}//end of for
		 
		if(mcount!=1)
		{	
			/*for loop to search whether the given input present or not*/
			for(int i=0;i<split.length;i++)
			{
				/*if condition to compare the value*/
				if(!split[i].equals(msearch))
				{
					System.out.println(" No Word found.So,now adding the word and displaying the list and saving the changes in the file.");
					addList(ls,msearch);//calling addlist method
					break;
				}	//end of if
			}//end of for
		}//end of if
	}//end of search
	
	/*if search found then deleting the item  */
	public void deleteList(List<String>ls,String msearch)
	{
		ls.remove(msearch);//it will remove the item from the list
		Iterator itr=ls.iterator();//use to iterat the arraylist
		while(itr.hasNext())
		{
			System.out.println(itr.next());//display the item
		}//end of while
        writeList(ls);
	}//end of delete

	/*if search not found then add the item  */
	public void addList(List<String>ls,String msearch)
	{
		ls.add(msearch);//it will add the item from the list
		Iterator itr=ls.iterator();//use to iterat the arraylist
		while(itr.hasNext())
		{
			System.out.println(itr.next());//display the item
		}//end of while
        writeList(ls);
	}//end of addlist
    public void writeList(List<String> ls)
    {
                String file_name = "UnorderedList.txt";
        try {

                FileWriter fstream = new FileWriter(file_name);
                BufferedWriter out = new BufferedWriter(fstream);
                
                Iterator itr = ls.listIterator();
                while (itr.hasNext()) 
                {
                   // ls element = itr.next();
                    out.write(itr.next()+" ");
                }

                out.close();
                System.out.println("File created successfully.");

         } 
        catch (Exception e) 
        {
        }
    }
    public static void main(String []args)
	{
		 UnorderedList uorder=new UnorderedList();
		 uorder.userInput();

    }//end of main
}//end of class
  

