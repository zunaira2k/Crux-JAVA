package lec_2;

import java.util.Scanner;

public class Pattren22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row =1;
		int star = n;
		while(row <= n){
			int count = 5;
			int i = 1;
			
					while(i <= n){
						if(i == star) {
							System.out.print("* ");
							star--;
						}
						else{System.out.print(count+" ");}
						i++;
						count--;
						
					}
					System.out.println();
			row++;
		}
	}

}
