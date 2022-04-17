package lec_6;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int rem =0;
		int mul = 1;
		int Decimal = 0;
		while(n>0) {
			rem  = n%10;
		Decimal = Decimal +rem *mul;
			n/=10;
			mul *= 2;
		}
		System.out.println(Decimal);
	}

}
