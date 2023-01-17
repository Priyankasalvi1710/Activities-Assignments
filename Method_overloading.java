package learning;

class calculation{
	static int multiply(int a,int b){
        return a*b;
    }
    static double multiply(double a,double b){
         return  a*b;
    }
}


public class Method_overloading {

	public static void main(String[] args) {
		
		System.out.println(calculation.multiply(11,11));  
		System.out.println(calculation.multiply(11.54,65.5284));
		
		
	}

}
