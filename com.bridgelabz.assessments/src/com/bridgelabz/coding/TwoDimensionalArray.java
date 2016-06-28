//Question:2D arrays of integers and doubles from standard input and printing them out to standard output ?
package com.bridgelabz.coding;
import com.bridgelabz.utility.Utility;
public class TwoDimensionalArray
{	
	static Utility	u1 = new Utility();
		//Reads a 2D array of doubles from keyboard and returns it.
		public static double[][] readDoubleArray()
			{
			
				//read the input from keyboard 
				//ask the user no.of rows do you want
				System.out.print("Number of rows (M) :");
				int M=u1.inputInteger();
				//ask the user no.of columns do you want
				System.out.print("Number of columns (N) :");
				int N=u1.inputInteger();
				double[][] array=new double[M][N];
				for (int i=0;i<M;i++) 
					{
						for (int j=0;j<N;j++) 
							{
								array[i][j]=u1.inputDouble();
							 }
					}
				return array;
			}
		//Prints the 2D array of doubles on console as output.
		public static void Disp(double[][] array) //method 1
			{
				int M = array.length;
				int N = array[0].length;
				for (int i=0; i<M;i++) 
					{
					 for (int j=0;j<N;j++) 
						 {
							System.out.print(" "+array[i][j]);
						 }
					System.out.println();
					}
			}
		// Reads a 2D array of integers from keyboard as input and returns it.
		public static int[][] readIntArray() 
			{
				System.out.print("Number of rows (M) :");
				int M=u1.inputInteger();
				System.out.print("Number of columns (N) :");
				int N=u1.inputInteger();
				int[][] array = new int[M][N];
				for (int i=0;i<M;i++)
					{
						for (int j=0;j<N;j++) 
							{
								array[i][j]=u1.inputInteger();
							 }
					}
				return array;
			}
			//Print a 2D array of integers on console as output.
			public static void Display(int[][] array) //method 2
				{
					 int M = array.length;//it will taken rows length
					 int N = array[0].length;//it will taken columns length
					for (int i=0; i<M; i++) 
						{
							for (int j=0;j<N;j++)
								{
									System.out.print(" "+array[i][j]);
								}
									System.out.println();
						}
				}
	public static void main(String[] args) 
	{
		// read and print an matrix of doubles
        double[][] a=TwoDimensionalArray.readDoubleArray();
		System.out.println("================================");
		System.out.println("=====2D Double Array==========");
		System.out.println("================================");
		TwoDimensionalArray.Disp(a);//static method calls method 1
		System.out.println();
        // read and print a matrix of integers
       int[][] b=TwoDimensionalArray.readIntArray();
		System.out.println("================================");
		System.out.println("=====2D Integers Array==========");
		System.out.println("================================");
        TwoDimensionalArray.Display(b);//static method calls method 2
        System.out.println();
		
	}
}
