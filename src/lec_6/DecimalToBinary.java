package lec_6;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int rem =0;
		int mul = 1;
		int Binary = 0;
		while(n>0) {
			rem = n%2;
			Binary = Binary + rem *mul;
			n/=2;
			mul*=10;
		}
System.out.print(Binary);
	}

}
