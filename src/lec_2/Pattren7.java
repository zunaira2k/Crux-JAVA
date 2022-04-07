package lec_2;

import java.util.Scanner;

public class Pattren7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		int row = 1;
		int space = 1;
		int star = n;
		while(row <= n) {
			int j = 1;
					while(j <= space-1) {
					System.out.print(" ");
			j ++;}
					int i = 1;
					while(i <= star) {
						System.out.print("*");
						i++;
					}
					System.out.println();
					row++;
					space = space+2;
					star--;
		}
		
	}

}
