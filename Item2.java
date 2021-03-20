/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Stack;

/**
 *
 * @author wilfr
 */
public class Item2 {
    
    public static void main(String[] args) {

        Stack<String> Barcelona = new Stack<>(); 
        Stack<String> Barcelona2 = new Stack<>();
          
        
        Barcelona.push("L");
        Barcelona.push("A");
        Barcelona2.push(Barcelona.peek());
        Barcelona.pop();
        Barcelona.push("S"); 
        Barcelona.push("T");
        Barcelona.push("I");
        Barcelona2.push(Barcelona.peek());
        Barcelona.pop();
        Barcelona.push("N");
        Barcelona2.push(Barcelona.peek());
        Barcelona.pop();
        Barcelona.push("F");
        Barcelona.push("I");
        Barcelona.push("R");
        Barcelona2.push(Barcelona.peek());
        Barcelona.pop();
        Barcelona.push("S");
        Barcelona.push("T");
        Barcelona2.push(Barcelona.peek());
        Barcelona.pop();
        Barcelona.pop();
        Barcelona.push("O");
        Barcelona.push("U");
        Barcelona.pop();
        Barcelona.push("T");
        Barcelona.pop();
        Barcelona.pop();
        Barcelona.pop();
        Barcelona.pop();
        Barcelona.pop();
        
        Barcelona.isEmpty();
       
        
       
        System.out.println("Output:  " + Barcelona2);
        System.out.println("Output:  " + Barcelona.isEmpty());
       
    } 
    
}
