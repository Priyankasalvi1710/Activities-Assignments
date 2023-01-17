package learning;

class flowers{
	public void flower() {
		System.out.println("I am a rose symbol of love");
	}
}
class lotus extends flowers{
	public void flower(){
	System.out.println("I am a lotus symbol of purity");
}
}
class lily extends flowers{
	
	public void flower(){
		System.out.println("I am a lily symbol of rebirth");
	}
}




public class Method_overriding {

	public static void main(String[] args) {
		flowers obj1 = new flowers();
		flowers obj2 = new lotus();
		flowers obj3 = new lily();
		
		obj1.flower();
		obj2.flower();
		obj3.flower();
		
		

	}

}
