/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import javax.swing.JOptionPane;

/**
 *
 * @author MAC pro
 */
public class LLQueue implements Queue 
{
    
    
    protected SLinkedList Q = new SLinkedList();				// LinkedList used to implement the queue 
	 
	   
	 public LLQueue() {
		   // default constructor: creates queue with default capacity
		 
	 }

	
	 public void enqueue(Object n)
	 {
             Q.gotoTail();
		 Q.insertNext(n);
                 
                    
                System.out.println(n+ " added to the queue");
	 }
	 
	 public Object dequeue()
	 {
		 // Can't do anything if it's empty
		 if (Q.isEmpty())
			 return null;
		 Q.gotoHead();
		 Object toReturn = Q.getCurr();
                 Q.deleteHead();
                // Q.deleteHead();
                 System.out.println(toReturn+ " removed from the queue");
                 return toReturn;
         }	 
	 
	 
         
    @Override
         public boolean isEmpty()  {
	     return Q.isEmpty();
	 }
	 
    @Override
	 public boolean isFull() {
		 //return (rear == capacity-1);
             return false;
	 }
	 
    @Override
	 public Object front()
	 {
		 if (Q.isEmpty())
			 return null;
		 
		 return Q.getCurr();
	 }
}
	 
	

