/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @BARCELONA, JEREMIAH PEDRO
 */
import java.util.*; 
public class Item1
{
	public static void main(String[] args) {

        Stack<String> Jeremiah = new Stack<>(); 
        Stack<String> Jeremiah2 = new Stack<>();
          
        
        Jeremiah.push("Q");
        Jeremiah.push("U");
        Jeremiah.push("E");
        Jeremiah2.push(Jeremiah.peek());
        Jeremiah.pop();
        Jeremiah.push("L");
        Jeremiah2.push(Jeremiah.peek());
        Jeremiah.pop();
        Jeremiah.push("L"); 
        Jeremiah.push("O");
        Jeremiah.push("S");
        Jeremiah2.push(Jeremiah.peek());
        Jeremiah.pop();
        Jeremiah.pop();
        Jeremiah.pop();
        Jeremiah.push("S");
        Jeremiah.push("T");
        Jeremiah2.push(Jeremiah.peek());
        Jeremiah.pop();
        Jeremiah.pop();
        Jeremiah.pop();
        Jeremiah.push("A");
        Jeremiah.push("C");
        Jeremiah2.push(Jeremiah.peek());
        Jeremiah.pop();
        Jeremiah.push("K");
        Jeremiah2.push(Jeremiah.peek());
        Jeremiah.pop();
        Jeremiah.pop();
        Jeremiah.pop();
        
        Jeremiah.isEmpty();
       
        
       
        System.out.println("Output:  " + Jeremiah2);
        System.out.println("Output:  " + Jeremiah.isEmpty());
       
    } 
}
