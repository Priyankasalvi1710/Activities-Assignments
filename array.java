package learning;

public class array {

	public static void main(String[] args) {
		
		
//		print length size of array(a.length)
		int a[] = {100,200,300,400,500};
	System.out.println(a.length);
	
	
//	To change the value of a specific element 
	
	a[3]=1000;
	System.out.println(a[3]);
	
	
//	// for loop array
	String[]dish = {"Dal","Rice","Butter chicken","Chicken briyani","Veg briyani"};
	for(int i=0; i<= dish.length; i++) {
		System.out.println(dish[i]);
	}
//	For each loop

	String[]dish1= {"Dal","Rice","Butter chicken","Chicken briyani","Veg briyani"};
	for(String b:dish1) {
	System.out.println(b);	
	}
		
		
	}

}