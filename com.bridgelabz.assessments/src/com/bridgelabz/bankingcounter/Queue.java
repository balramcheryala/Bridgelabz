package com.bridgelabz.bankingcounter;
import com.bridgelabz.bankingcounter.Node;
import com.bridgelabz.utility.Utility;
public class Queue<E>
{
    Utility u1=new Utility();
    static int cashBal =10000;
    public  Node<E> front ;
    public static   int COUNT=0;
    // method for Adding The Queue
    public void addAtFront(int data)
    {
        Node<E> temp = new Node();
        temp.data =data;
        temp.nextNode = null;
        if(front == null)
        {
            front =temp;
        }
        else
        {
            Node <E> temp1 = front;
            while(temp1.nextNode!= null)
            {
                temp1=temp1.nextNode;
            }
            temp1.nextNode=temp;
        }
    }
    // method for Deleting The Queue
    public void deleteAtRear()
    {
        Node<E> rear = new Node();
        rear=front;
        if(front==null)
        {
            System.out.println("Sorry queue is Empty ");
        }
        else
        {
            front=front.nextNode;
        }
        COUNT--;
    }
    // method For Size
    public int size()
    {
        return COUNT;
    }

    // Function for operations withdraw and Deposit
    public void doOpearations()
    {
        int count= size();
        while(front != null)
        {
            System.out.println("Tranactions is Going on");
            if(front.data == 1)
            {
                System.out.println("Enter How Much Money Do U Want Deposit ");
                int money =u1.inputInteger();
                cashBal=cashBal+money;
                System.out.println( "user Deposit money Succesfully "+money);
                deleteAtRear();
            }
            else if(front.data == 2)
            {
                System.out.println("Enter How Much Money Do U Want Withdraw");
                int money =u1.inputInteger();
                if(money<cashBal)
                {
                    cashBal=cashBal-money;
                    System.out.println( "user Withdrawn money Succesfully " +money);
                    deleteAtRear();
                }
                else
                    System.out.println("Cash Counter Empty");
                	System.exit(0);
            }
        }
    }
    public void display(){
        Node<E>rear=front;
        if(rear==null)
        {
            System.out.println(" Queue Is Empty ");
        }
        else
        {
            while(rear!=null)
            {
                System.out.print(rear.data+"  ");
                rear=rear.nextNode;
            }
        }
    }
    public int  getCashCounterBalance()
    {
        return cashBal;
    }
}
