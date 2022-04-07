package lec_2;

import java.util.Scanner;

public class Pattren15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		int star = n;
		int space = -1;
		while(row <= n) {
			int i = 1;
			while(i <= star) {
			System.out.print("* ");
			i++;
			}
			int j = 1;
			while(j <= space){
				System.out.print("  ");
				j++;
			}
			i=1;
			if(row == 1) {
				while(i < star) {
					System.out.print("* ");
					i++;
			}
			}
				else {
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
				}
			System.out.println();
			star-=1;
			space+=2;
			row++;
		}

	}

}
