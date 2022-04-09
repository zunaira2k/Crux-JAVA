package lec_2;

import java.util.Scanner;

public class Pattren23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		int star = 1;
//		
		while(row<=(2*n)-1) {
			if(row < n) {
				int j = 1;
				while(j <= star) {
					System.out.print("* ");
					j++;
				}
				System.out.println();
				star++;
				
			}else {
				
				int j = 1;
			while(j <= star) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			star--;
				
			}
			row++;
		}
		
	}

}
