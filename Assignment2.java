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
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a Queue
		Queue q = new LLQueue(); 
		
		// Put some strings onto the queue
		JOptionPane.showMessageDialog(null, "About to enqueue words onto queue: \nThe end is nigh!");
		q.enqueue("The");
		q.enqueue("end");
		q.enqueue("is");
		q.enqueue("nigh!");

		// Now dequeue them from the queue
		JOptionPane.showMessageDialog(null, "About to dequeue the words ...");
		while(! q.isEmpty()) {
			String word = (String)q.dequeue(); // Note: have to cast Objects popped to String
			JOptionPane.showMessageDialog(null, "Word dequeued: " + word);
		}
		
		System.exit(0);
	}
    }
    

