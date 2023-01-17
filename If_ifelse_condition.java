package learning;

public class If_ifelse_condition {

	public static void main(String[] args) {
		 
		int a = 10;
		int b = 100;
		int c = 5;
		
		if(a>=b && a>=c)
		{
			System.out.println("a is the the greater number" + a);
			
		}
		
		else if (b>=c && b>=a) {
			System.out.println("b is the greater number" + b);
		}
		
		else {
			System.out.println("c is the greater number" + c);
		}

	}

}
