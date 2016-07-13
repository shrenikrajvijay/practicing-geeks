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
public class dynamic {
    public static void main(String[] args) {
        ugly(12);
    }

    private static void ugly(int i) {
        
        int uglyNumber = 0;
        int uglyCount = 0;
        int two=2, three=3, five=5;
        
        for(int j=0; j < i ; j++){
            int twothree = Math.min(two, three);
            int twothreefive = Math.min(twothree, five);
            if(twothreefive == two)two=two+2;
            if(twothreefive == three)three=three+3;
            if(twothreefive == five)five = five+5;
            uglyNumber = twothreefive;
            System.out.println(uglyNumber);
        }
        
        
    }
}
