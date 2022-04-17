	package lec_4;

import java.util.Scanner;

public class PrimeNumber {

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
				
			}
			i++;
		}
		if(fact > 0) {
			System.out.println("NOT PRIME ");
		}
		else {
		System.out.println("PRIME ");}
	}

}
