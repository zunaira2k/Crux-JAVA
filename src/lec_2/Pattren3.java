package lec_2;
import java.util.*;

public class Pattren3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.close();
	int row = 1;
	int star = 1;
	while(row <= n ) {
		int i = 1;
		while(i <= star) {
			System.out.print("* ");
			i++;
		}
		//next row preparation
		row++;
		star++;
		System.out.println();
	}
	}
}
