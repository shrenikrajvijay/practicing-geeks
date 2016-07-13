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
public class fibonacciTopDown {
    
    static int lookup [];
    
    public static void main(String[] args) {
        int fibNumber = 15;
        lookup = new int[fibNumber+1];
        System.out.println(fib(fibNumber));
    }
    
    public static int fib(int n){
        
        if(lookup[n] == 0){
            if(n<=1){lookup[n] = n;}
        
        else{
            lookup[n] = fib(n-1) + fib(n-2);
        }
        }
    
    return lookup[n];
}
}
