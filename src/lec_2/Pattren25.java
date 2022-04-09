package lec_2;

public class Pattren25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int star = n/2+1;
		int space = -1;
		int row = 1;
		while(row <= n) {
			
			int i = 1;
			while(i <= star) {
			System.out.print("* ");
			i++;}
			int j = 1;
			while(j <= space) {
				System.out.print("  ");
				j++;
			}
            
			int k =1;
			if(row == 1|| row== n) {
			
			while(k <= star-1) {
				
				System.out.print("* ");
				k++;}
			}
			else {
			while(k <= star) {
					
					System.out.print("* ");
					k++;}
			}
			if(row <= n/2) {
			space+=2;
			star--;}
			else {
				star++;
				space-=2;
			}
			row++;
			System.out.println();
		}

	}

}
