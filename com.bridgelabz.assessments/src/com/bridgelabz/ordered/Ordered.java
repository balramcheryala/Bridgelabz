
package com.bridgelabz.ordered;

/* Program on Ordererd list
 * creating a list Using the Linkedlist
 * Adding element using Ascending Order
 *
 */
import com.bridgelabz.utility.Utility;
import com.bridgelabz.ordered.Node;

// Creating the class
public class Ordered<E>
{

    Node <E> start;
    Utility obj = new Utility();

    // get data From a file
  public  void getDataFromFile()
    {
        int[] retArry = obj.intFileReader();
        int[] sortArray =obj.sorting(retArry);
        int size =retArry.length;
        System.out.println("Array Size is "+size);
        for(int i=0;i<size;i++)
        {

            addItem(retArry[i]);
        }
    }


    // Function for Lsit
   public  void List()
    {
        if(start ==null)
        {
            System.out.println("List is Empty ");
        }
    }


    // add item Function 
    public void addItem(Integer data)
    {
        Node<E>head = start;
        Node<E>temp = new Node();
        temp.data = (E) data;
        temp.next =null;
        if(start == null)
        {
            start = temp;
        }
        else
        {
            while(head.next != null)
            {
                head=head.next;
            }
            head.next=temp;
        }

    }

		// Display Function
    public void display()
    {
        Node<E>temp =start;
        System.out.print("[");
        while( temp != null)
        {
            System.out.print( temp.data +"\t");
            temp=temp.next;
        }
        System.out.print("]");
        System.out.println(" ");
    }
     // Size of Function
    int size()
    {
        int count=0;
        Node<E>temp =start;
        while( temp.next != null)
        {
            temp=temp.next;
            count++;
        }
        System.out.println("size of Linked List"+count);
        return count;
    }
 
   // Serching of a Word Function
  public  void serchWord()
    {
        Node<E>temp = start;
        int count=0;
        System.out.println("Enter a String to Search");
        int s =obj.inputInteger();
        int flag=0;
        while(temp.next != null)
        {
            count++;
            if( (Integer)temp.data == s)
            {
                System.out.println(" String found At "+count);
                flag++;
                break;

            }
            temp=temp.next;
        }

        if(flag == 1)
        {
            removeWord(count);
        }
        else
        {
            addItem(s);
            System.out.println("After Adding a LIst ");
            display(); 
        }

    }



    // removeWord From a Linked lIst
   public  void removeWord(int count)
    {
        Node<E>temp = start;
        if(count==1)
        {
            start =start.next;
        System.out.println("After Deleting LIst is ");

        display();
        }
        else if(count==2)
        {
        	start.next = start.next.next;

            display();
        }
        else
        {
        for(int i=0;i<count-1;i++)
        {
            temp=temp.next;
        }
        temp.next =temp.next.next;
        System.out.println("After Deleting LIst is ");
        display();
        }
    }






    public static void main(String[] args)
    {
        Ordered<Integer> obj = new Ordered();
        obj.getDataFromFile();
        obj.display();

        obj.size();
       obj.serchWord();



    }
}
