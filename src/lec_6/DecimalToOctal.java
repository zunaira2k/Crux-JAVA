package lec_6;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int rem =0;
		int mul = 1;
		int Octal = 0;
		while(n>0) {
			rem = n%8;
			Octal = Octal + rem *mul;
			n/=8;
			mul*=10;
		}
		System.out.print(Octal);
	}

}
