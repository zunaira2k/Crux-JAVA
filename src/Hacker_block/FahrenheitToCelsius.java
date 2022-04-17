package Hacker_block;
//Take the following as input.
//
//Minimum Fahrenheit value
//Maximum Fahrenheit value
//Step
//
//Print as output the Celsius conversions. Use the formula C = (5/9)(F – 32) E.g. for an input of 0, 100 and 20 the output is
//0 -17
//20 -6
//40 4
//60 15
//80 26
//100 37
import java.util.*;
public class FahrenheitToCelsius {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int min_temp = sc.nextInt();
        int max_temp = sc.nextInt();
        int steps = sc.nextInt();
        sc.close();
        while(min_temp <= max_temp){
            int c = (5*(min_temp - 32))/9;
            System.out.println(min_temp+"\t"+c);
            min_temp+=steps;
        }
    }
}
