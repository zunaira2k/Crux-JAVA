package lec_2;

import java.util.Scanner;

public class Pattren9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row =1;
		while(row<=n){
			if(row == 1 || row == n) {
				int i = 1;
				while(i <= n) {
				System.out.print("* ");
				i++;}
			}
			else {
				int j = 1;
				while(j <= n) {
					if(j == 1 || j == n) {
					System.out.print("* ");}
					else {
						System.out.print("  ");
					}
					j++;
				}
			}
			System.out.println();
			row++;
		}	
	}

}
