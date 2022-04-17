package Hacker_block;

import java.util.Scanner;

public class FabonacciSeries {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int rows = 0;
        int fab = 0;
		int star = 1;
        int b = 1;
		while(rows < n) {
			
			int j = 0;
			while(j < star) {
			System.out.print(fab+"\t");
			int c = fab + b;
            fab = b;
            b = c;
			j++;}
			
			System.out.println();
			rows++;
			star++;
			
		} 
    }
}
