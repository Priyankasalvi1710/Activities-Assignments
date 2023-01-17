package Expections;

public class Throw {
	static void checkEligibilty(int studage, int studmarks){ 
		
		if((studage<=18) & (studmarks<=50)) {
	         throw new ArithmeticException("you are not eligible for exam"); 
	      }
		else {
	         System.out.println("You are  eligible for exam "); 
	      }
	}

		public static void main(String[] args) {
			System.out.println("Welcome to the Exam Registration Form");
			checkEligibilty(20, 6);
			System.out.println("Have a great day"); 
	}

}
