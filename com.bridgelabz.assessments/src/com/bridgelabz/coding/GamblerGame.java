/*	Created by BridgeLabz on 09/05/2016.
 * 	Purpose:Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke
 * 	(i.e. has no money)or reach $goal. 
 * 	Keeps track of the number of times he/she wins and the number of bets he/she makes. 
 * 	Run the experiment N times, averages the results, and prints them out.
 * 	copyrighted by BridgeLabz.
 */

package com.bridgelabz.coding;
import com.bridgelabz.utility.Utility;

public class GamblerGame { 

	public void printMethod(){
		 Utility u1 = new Utility();
		 int bets = 0;        // total number of bets made
	     int wins = 0;        // total number of games won
		
	     System.out.println("Enter The Stake"); 
		
	     int stake = u1.inputInteger();    // Stake
		
	     System.out.println("Enter The Goals");
		
	     int goal  =u1.inputInteger();   // goals rate
		
	     System.out.println("Enter No of Trails");
		
	     int T     = u1.inputInteger();  // no of Trails
		
	     // repeat T times
        for (int i = 0; i < T; i++) {

           // do one gambler's ruin simulation
         int cash = stake;
           
         while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) 
                	cash++;     // win $1
                else                     
                	cash--;     // lose $1
            }
            	if (cash == goal) 
            		wins++;     // did gambler go achieve desired goal?
        }
     // print results
    	System.out.println(wins + " wins of " + T);
    	System.out.println("Percent of games won = " + 100.0 * wins / T);
    	System.out.println("Percent of game Loss = "+((100)-(100.0 * wins / T)));
	}

    public static void main(String[] args) {
	
    	GamblerGame pm = new GamblerGame();
    	pm.printMethod();
     

    }
}

