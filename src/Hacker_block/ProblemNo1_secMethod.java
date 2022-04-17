package Hacker_block;

import java.util.Scanner;

public class ProblemNo1_secMethod {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int  n = sc.nextInt();
	sc.close();
	int row=1;
	int space= n-1;
	int star=1;
	int val = 1;
	while(row<=2*n-1) {
		
		int i=1;
		while(i<=space) {
			System.out.print("\t");
			i++;
		}
		int j=1;
		int p=val;
		while(j<=star) {
			System.out.print(p+"\t");
			if(j<=star/2) {
			p++;
			}
			else {
				p--;
			}
			j++;
		}
		
		if(row<n) {
			val++;
			space--;
			star+=2;
		}
		else {
			val--;
			space++;
			star-=2;
		}
		
		row++;
		System.out.println();
		
	}
}
}
