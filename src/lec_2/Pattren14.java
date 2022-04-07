package lec_2;

import java.util.Scanner;

public class Pattren14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row =1;
		int space = 2*n - 3;
	
		
		while(row <= n ) {
			int j = 1;
			while(j <= row) {
				System.out.print("* ");
				j++;
			}
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			j=1;
			if(row == n) {
				while(j < row) {
					System.out.print("* ");
					j++;
					}	
			}
			else {
			while(j <= row) {
			System.out.print("* ");
			j++;
			}
			}
			System.out.println();
			space-=2;
	
			row++;
		}
		

	}

}
