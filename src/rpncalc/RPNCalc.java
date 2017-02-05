/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpncalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *
 * @author Mikkel
 */
public class RPNCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Double> stack = new Stack();
        while(true){
            String line = reader.readLine();
            String[] symbols = line.split(" ");
            for(String symbol : symbols){
                switch(symbol){
                    case "+":
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case "-":
                        stack.push(stack.pop() - stack.pop());
                        break;
                    case "*":
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case "/":
                        stack.push(stack.pop() / stack.pop());
                        break;
                    default:
                        stack.push(Double.parseDouble(symbol));
                        break;
                }
                System.out.println(stack);
            }
        }
    }
}
