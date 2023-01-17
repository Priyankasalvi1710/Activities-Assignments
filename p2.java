package learning;

public class p2 {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder ("codedecode");
		
		str.deleteCharAt(3);
		str.deleteCharAt(str.length()-1);
		
		System.out.println(str.toString());
	}
}
	


