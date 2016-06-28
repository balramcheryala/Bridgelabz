package com.bridgelabz.hashfunction;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.ordered.Ordered;


public class HashingMain
{

    public static void main(String[] args)

    {
    	Ordered[] order = new Ordered[11];

    	Utility object =new Utility();
        int[] retArray = object.intFileReader();
        for(int i=0; i<retArray.length; i++)
        {
            int rem = retArray[i] % 11;
            if(order[rem]== null)
            {
                order[rem] = new Ordered();
                order[rem].addItem(retArray[i]);
            }
            else
                order [rem].addItem(retArray[i]);

        }
        

        for(int i=0;i<11;i++)
        {
            System.out.println(i );
            if(order[i] !=null)
            {
                order[i].display();
            }
        }
}
}