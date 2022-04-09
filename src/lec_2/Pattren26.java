package lec_2;
public class Pattren26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		int star = 1;
		int space = n-1;
		
		while(row <= n){
			int i = 1;
			while(i <= space){
			System.out.print("  ");
			i++;}
			int j = 1;
			int count = 1;
			while(j <= star){
				
			if(j < (star/2)+1) {
			System.out.print(count+" ");
			count++;}
			else {
				System.out.print(count+" ");
				count--;
			}
			j++;
			}
			System.out.println();
			star+=2;
			space--;
			row++;
		}
	}

}
