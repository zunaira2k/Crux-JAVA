package Hacker_block;

//Take the following as input.A number
//Assume that for a number of n digits, the value of each digit is from 1 to n and is unique. E.g. 32145 is a valid input number.
//
//Write a function that returns its inverse, where inverse is defined as follows
//
//Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place, therefore in 12543, “2” is at 4th place.
//
//Print the value returned.
import java.util.*;
public class InverseOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        int rev = 0;
       
        while(n>0){
            int digit = n%10;
            int mul = i;
            while(digit>1){
                
                mul*=10;
                digit--;
            }
            //rev = (int) (rev + i*Math.pow(10, rem-1));
            rev = rev + (mul);
            n= n/10;
            i++;
        } 
        System.out.print(rev);
    }
}