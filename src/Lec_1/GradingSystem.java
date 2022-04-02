package Lec_1;

public class GradingSystem {
	public static void main(String[] args){
		int marks = 45;
		if(marks>= 75) {
			System.out.println("A");
		}
		else if(marks<75 && marks>= 60) {
			System.out.println("B");
		}
		else if(marks<60 && marks>= 50) {
			System.out.println("c");
		}
		else if(marks<50 && marks>= 40) {
			System.out.println("D");
		}
		else if(marks<40 & marks>= 30) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
	}

}
