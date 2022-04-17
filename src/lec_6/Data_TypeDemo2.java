package lec_6;

public class Data_TypeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		double d = 90.9; //8byte == 64 bit
		System.out.println(d);
		float f = 89.9f; //4byte == 32 bit
		System.out.println(f);
		char c = 'A'; //2 byte == 16 bit
		System.out.println((int)(c));
		c++; // explicit type cast means forcefully casting
		System.out.println(c);
		c+=1; //implicit type casting(internally working) means computer is doing c = (char)(c+1)
		System.out.println(c);
		c =(char) (c+1); //explicit type casting (externally)
		System.out.println(c);
		boolean b = true; //1`bit
		System.out.println(b);
		
	}

}
