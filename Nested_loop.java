package learning;

public class Nested_loop {

	private static String j;

	public static void main(String[] args) {
		
		String t= "Shubhakanksalu";
		String h = "Namaste" ;
		String E = "Hello";
		
		for(int i=1;i<=3;i++) {
			
			System.out.println("Greeting in telugu : " + t);
			
			for(int j=1; j<=3; j++) {
				
				System.out.println(("Greeting in hindi : " + h)+ " "+t);
			}
			
for(int k=1; k<=3; k++) {
				
				System.out.println(("Greeting in English : " + E) + " "+ t +" "+h);
			}
		}
		
	}
}
