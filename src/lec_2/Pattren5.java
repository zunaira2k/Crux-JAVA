package lec_2;

import java.util.Scanner;

public class Pattren5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int rows = 1;
		int space = n-1;
		int star = 1;
		while(rows <= n) {
			int i = 1;
			while(i <= space ) {
			System.out.print("  ");
			i++;}
			
			int j = 1;
			while(j <= star) {
			System.out.print("* ");
			j++;}
			
			System.out.println();
			rows++;
			space--;
			star++;
			
		}
	}

}
