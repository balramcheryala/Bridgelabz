/*
*Created by :BridgeLabz
*Perpose: A palindrome is a string that reads the same forward and backward.
*for example, radar, toot, and madam. 
*We would like to construct an algorithm to input a string of characters
*check whether it is a Palindrome
* this BubbleSort program is Generic type.
* copyrighted by BridgeLabz.
*/
package com.bridgelabz.utility;
import com.bridgelabz.sortings.Deque;
public class Polindromeutility<E>
{
    Deque <E> front;
    Deque <E> rear;
    int size =0;

    public boolean isEmpty()
    {
        if(front == null)
        {
            return true;
        }
        else
            return false;
    }
    // Add at Front
    public void addFront(E c)
    {
        if(front == null)
        {
            front.mdata = c;
            rear = front;
        }
        else
        {
            Deque<E> tNode =null;
            tNode.mdata =c;
            tNode.mnext =front;
            front.mpre =tNode;
            front =tNode;
        }
        size++;
    }

    public void addRear(E c)
    {
        if(front == null){
            Deque <E> tNode =new Deque(c);
						
            front = tNode;

            rear =front;
        }
        else
        {
            Deque<E> tNode =new Deque(c);
            rear.mnext =tNode;
            tNode.mpre =rear;
            rear =tNode;
        }
        size++;
    }
    // remove Front
    public E removeFront()
    {
        E val =null;
        if(front == null)
        {
            System.out.println("List Empty No Element To Delete");
        }
        else{
            val=front.mdata;
            front =front.mnext;
        }
        size--;
        return val;
    }
    
    public E removeRear()
    {
        E val = null;
        if(front == null)
        {
            System.out.println(" List Empty NO ELement to delete ");
        }
        else
        {
            val=rear.mdata;
            rear=rear.mpre;
            rear.mnext=null;
        }
        size--;
        return val;
    }

    public int size()
    {
        return size;
    }

}
