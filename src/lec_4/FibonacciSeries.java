package lec_4;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to print ->0,1,1,2,3,5,8,13,21,34
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int fst = 0;
		int scd = 1;
		int prev = 0;
		//System.out.print(fst+" "+scd+" "); 
		while(n>0) {
//			System.out.print(fst+" ");
			prev = fst+ scd;
			fst = scd;
			scd = prev;
			n--;
			
		}
		System.out.println();
		System.out.println("Nth "+fst);
	}

}
