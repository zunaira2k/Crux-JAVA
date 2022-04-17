package lec_4;

import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int num = n-1;
		int i = 2;
		int fact = 0;
		while(i <= num) {
			if(n%i == 0) {
				fact++;
				break;
				
			}
			i++;
		}
		if(fact == 1) {
			System.out.println("NOT PRIME ");
		}
		else {
		System.out.println("PRIME ");}
	}

}
