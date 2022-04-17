package Hacker_block;
import java.util.*;
public class sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 10;
        while(sum > 0){
        	int n = sc.nextInt();
        	sum = sum +n;
            System.out.println(n);
            sum++;
        }
    }
}