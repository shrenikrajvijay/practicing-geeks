/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uglyNumber;

/**
 *
 * @author vijayshrenikraj
 */
public class simpleForLoop {
    public static void main(String[] args) {
        ugly(12);
    }
    
    public static int ugly(int n){
        int count = 2;
        int uglyCount = 1;
        int uglyNumber = 1;
        while(uglyCount < n){
            if(checkUgly(count)){
                uglyNumber = count;
                uglyCount++;
                System.out.print(count+", ");
            }
            
            count++;
            
        }
        return uglyNumber;
    }

    private static boolean checkUgly(int count) {
        while(count % 2 ==0)count = count / 2;
        while(count % 3 ==0)count = count / 3;
        while(count % 5 ==0)count = count / 5;
        
        if(count == 1) return true;
        else return false;
    }
}
