/*
 * Created by BridgeLabz on 08/05/2016.
 * Purpose:User Input Reader , file inputs used as a Utility file
 * copyrighted by BridgeLabz.
 */

package com.bridgelabz.utility;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.FileReader;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.IOException;
//import com.bridgelabz.node.Node;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileWriter;
public class Utility <E>
{
BufferedReader bufferedReader,buf;
  public Utility()
  {
    bufferedReader =new BufferedReader(new InputStreamReader(System.in));
  }
  //reading input string
	public String inputString()
  {
		try {
			   return bufferedReader.readLine();
		     }
		catch(Exception e){
			System.out.println(e);
		}
		return "";
	}
  //reading Integer Input
	public int inputInteger()
  {

			try{
				        try
                  {
					             return Integer.parseInt(bufferedReader.readLine());
				          }
				          catch(NumberFormatException e)
                   {
					                System.out.println(e);
				           }
			  }catch(Exception e)
        {
				    System.out.println(e);
			  }
		return 0;
	}
//reading double Input
	public double inputDouble(){

			try{
				try{
					return Double.parseDouble(bufferedReader.readLine());
				}
				catch(NumberFormatException e){
					System.out.println(e);
				}
			}catch(Exception e)
			{
				System.out.println(e);
			}
		return 0.0;
	}
    public E[] elementSort(E inputArray[])
    {
        System.out.println("===========================");
        E[] e=inputArray;
        if(inputArray instanceof Integer[])
        {
          for(int Loop=1; Loop<=inputArray.length;Loop++)
          {
              for(int current = 0;current<(inputArray.length -Loop);current++)
              {
                //if numbers[j-1] > numbers[j], swap the elements
                if(((Integer)e[current]) >((Integer)e[current+1]))
                  {
                    E temp= e[current];
                    e[current]=e[current+1];
                    e[current+1]=temp;
                  }//end of if
               }
               System.out.println("printing the Loop "+Loop);
               printArray(inputArray);
           }
        }//end of if
        else if(inputArray instanceof Double[])
        {
          for(int Loop=1;Loop<=inputArray.length;Loop++)
          {
              for(int current=0;current<(inputArray.length-Loop);current++)
              {
                //if numbers[j-1] > numbers[j], swap the elements
                if(((Double)e[current])>((Double)e[current+1]))
                  {
                    E temp= e[current];
                    e[current]=e[current+1];
                    e[current+1]=temp;
                  }//end of if
               }
               System.out.println("printing the Loop "+Loop);
               printArray(inputArray);
           }
        }//end of else if
        else if(inputArray instanceof String[])
        {
            for (int Loop=1;Loop<=inputArray.length;Loop++ )
            {
                for (int current=0;current<inputArray.length-Loop;current++ )
                {
                         if ( ((String)e[current]).compareToIgnoreCase(((String)e[current+1])) > 0)
                          {         // ascending sort
                                    E  temp=e[current];
                                      e[current] =e[current+1];    // swapping
                                      e[current+1]=temp;
                           }//end of if
                   }
                   System.out.println("printing the Loop "+Loop);
                   printArray(inputArray);
             }
        }//end of else if
        System.out.println("===========================");
    		return e;
    }
    public void printArray(E[] numbers)
    {
      int len=numbers.length;
      for(int i=0;i<len;i++)
      {
      System.out.print(numbers[i]+" ");
      }
      System.out.println();
    }
    public E[] dataSort(E inputArray[])
    {
        System.out.println("===========================");
        E[] e=inputArray;
        if(inputArray instanceof Integer[])
        {
          int Loop;
          for(Loop=1; Loop<=inputArray.length-1;Loop++)
          {
              int key=(Integer)inputArray[Loop];
              E key1=inputArray[Loop];
              int i=Loop-1;
              while((i>-1) && ((Integer)inputArray[i]>key))
              {
                  inputArray[i+1]=inputArray[i];
                  i--;
              }//end of while
                  inputArray[i+1]=key1;
               System.out.println("printing the Loop "+Loop);
               printArray(inputArray);
           }
        }//end of if
        else if(inputArray instanceof Double[])
        {
          int Loop;
          for(Loop=1;Loop<=inputArray.length-1;Loop++)
          {
              double key=(Double)inputArray[Loop];
              E key1=inputArray[Loop];
              int i=Loop-1;
              while((i>-1) && ((Double)inputArray[i]>key))
              {
                  inputArray[i+1]=inputArray[i];
                  i--;
              }//end of while
                  inputArray[i+1]=key1;
               System.out.println("printing the Loop "+Loop);
               printArray(inputArray);
           }
        }//end of else
        else if(inputArray instanceof String[])
        {
          int Loop;
            for (Loop=1;Loop<=inputArray.length-1;Loop++ )
            {
                  String key=(String)inputArray[Loop];
                  E key1=inputArray[Loop];
                  int i=Loop-1;
                  while((i>=0))
                  {
                    if(key.compareTo((String)inputArray[i])>0)
                    {
                      break;
                    }
                    inputArray[i+1]=inputArray[i];
                    i--;
                  }//end of while
                    inputArray[i+1]=key1;
               System.out.println("printing the Loop "+Loop);
               printArray(inputArray);
             }
           }
        System.out.println("===========================");
    		return e;
      }//end of method
        public Integer binarySearch(E[] wordsArray, String key, int lower, int upper)
        {
            E[] e=wordsArray;
            if(wordsArray instanceof String[])
            {
              if (lower>upper)
                   {
                       return -1;
                   }
                   Integer middle=(upper+lower)/2;
                   if (wordsArray[middle].equals(key))
                   {
                      return middle;
                   }
                   else if(((String)wordsArray[middle]).compareTo(key) > 0)
                   {
                       return binarySearch(wordsArray,key,lower, middle-1);
                   }
                   else
                   {
                       return binarySearch(wordsArray,key,middle+1,upper);
                   }
            }//end of if
          return 0;
        }
        
      //Function take String in dd/MM/yyyy format and return Date Object
    	public Date stringToDate(String date){
    		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    		try{
    			return (Date) sdf.parse(date);
    		}
    		catch(ParseException parseException){
    			return null;
    		}
    	}
    	
    	
    	//  FileReader
    	//Take file name as input and return string of file text
    	public String getFileText(String fileName){

    		try{

    			buf=new BufferedReader(new FileReader(fileName));
    			StringBuilder sb=new StringBuilder();
    			String line=buf.readLine();
    			while(line!=null){
    				sb.append(line);
    				sb.append(System.lineSeparator());
    				line=buf.readLine();
    			}
    			return sb.toString();
    		 }
    		catch(Exception exception){
    			return null;
    		}
    		finally{
    			try{
    				buf.close();
    			}
    			catch(IOException exception){
    			}	
    		}
    	}
    	public void writeToFile(String data,String fileName)throws Exception{
    		File file = new File(fileName);
    		if (!file.exists()) {
    			file.createNewFile();
    		}
    		FileWriter writer = new FileWriter(file); 
           // Writes the content to the file
           writer.write(data); 
           writer.flush();
           writer.close();
    	}

    	public void printMap(Map mp) {
        		Iterator it = mp.entrySet().iterator();
        		while (it.hasNext()) {
            		Map.Entry pair = (Map.Entry)it.next();
            		System.out.println(pair.getKey() + " = " + pair.getValue());
            		it.remove(); // avoids a ConcurrentModificationException
        		}
    
    	}
   

        public int[] intFileReader()
        {
        	String[] arr;
        	int[] abc = null;
            try
            {
                String intFile = new String();
                FileReader fr = new FileReader("integer.txt");
                BufferedReader br = new BufferedReader(fr);
                String s;
                while((s = br.readLine()) != null) {

                    intFile += s;
                }
                intFile = intFile.replaceAll("\\n",",");
                intFile = intFile.trim();
                arr = intFile.split(","); 
                abc = new int[arr.length];
                for(int i=0; i < abc.length;i++)
                {
                    try
                    {
                        abc[i]= Integer.parseInt(arr[i]);
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Exception in file reading ----------------->");
                    }
                }
            }
            catch(Exception obj)
            {

                System.out.println("Exception in file reading ");
            }
            return abc;
        }
        public int [] sorting(int array[])
        {
            int n = array.length;
            for (int j = 1; j < n; j++) {
                int key = array[j];
                int i = j-1;
                while ( (i > -1) && ( array [i] > key ) ) {
                    array [i+1] = array [i];
                    i--;
                }
                array[i+1] = key;
            }
            return array;
        }
    

}