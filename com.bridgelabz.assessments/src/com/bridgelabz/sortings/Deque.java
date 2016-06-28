/*
*Created by :BridgeLabz
*Purpose: A palindrome is a string that reads the same forward and backward.
*for example, radar, toot, and madam. 
*We would like to construct an algorithm to input a string of characters
*check whether it is a Palindrome
* this BubbleSort program is Generic type.
* copyrighted by BridgeLabz.
*/

package com.bridgelabz.sortings;

public class Deque<E>
{
    public E mdata;
    public Deque<E> mnext;
    public Deque <E> mpre ;

public Deque(E val)
	{
    this.mdata =val;
    this.mnext =null;
    this.mpre = null;
	}

}


