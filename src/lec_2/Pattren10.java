package lec_2;

import java.util.Scanner;

public class Pattren10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		int star = 1;
		int space = n;
		while(row <= n){
			int i = 1;
			while(i <= space-1){
			System.out.print("  ");
			i++;}
			int j = 1;
			while(j <= star){
				if(j%2 != 0) {
				System.out.print("* ");}
				else {
					System.out.print("! ");
				}
				j++;
			}
			System.out.println();
			star+=2;
			space--;
			row++;
		}
	}

}
