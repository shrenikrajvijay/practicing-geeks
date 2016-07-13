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
public class fibonacciBottomUp {
    public static void main(String[] args) {
        System.out.println(fib(15));
    }
    
    public static int fib(int n){
        int back2 = 0;
        int back1 = 1;
        for(int i=0;i<n-1; i++){
            int temp = back1 + back2;
            back2 = back1;
            back1 = temp;
        }
        return back1;
        
    }
}
