package lec_2;

import java.util.Scanner;

public class Pattren21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row =1;
		while(row <= n){
			int count = 5;
			int i = 1;
					while(i <= n){
						System.out.print(count+" ");
						i++;
						count--;
					}
					System.out.println();
			row++;
		}
	}

}
