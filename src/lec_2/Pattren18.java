package lec_2;

import java.util.Scanner;

public class Pattren18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		int star = 1;
		int space = n-1;
		int count = 1;
		while(row <= n){
			
			int i = 1;
			while(i <= space){
			System.out.print("   ");
			i++;}
			int j = 1;
			while(j <= star){
				if(count<10) {
				System.out.print(count++ +"  ");
				}
				else {
					System.out.print(count++ +" ");
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
