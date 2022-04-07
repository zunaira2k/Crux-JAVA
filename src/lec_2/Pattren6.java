package lec_2;

import java.util.Scanner;

public class Pattren6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int star = n;
		int space = 1;
		int row = 1;
		while(row <= n) {
			int i = 1;
			int j = 1;
			while( j < space) {
				System.out.print("  ");
				j++;
			}
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
				space++;
			    star--;
			    row++;
		}

	}

}
