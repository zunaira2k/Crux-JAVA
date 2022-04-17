package Hacker_block;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int rows = 0;
		int star = 1;
		while(rows < n) {
			int NCR = 1;
			int j = 0;
			while(j < star) {
			System.out.print(NCR+" ");
			NCR = (NCR *(rows-j))/(j+1);
			j++;}
			
			System.out.println();
			rows++;
			star++;
			
		} 
	}

}
