/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author vijayshrenikraj
 */
public class regularFibonacci {
    
    public static void main(String args[]){
        System.out.println(fib(15));
    }
    
    //fibonacci calculator
    public static int fib(int n){
        if(n<=1) return n;
        
        return fib(n-1)+fib(n-2);
    }
}
