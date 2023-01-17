package learning;

class petanimal{
	
	public void sound() {
		System.out.println("Sound of cat is : meowww");
	}
	
}

class elephant extends petanimal{
	
	public void sound() {
		System.out.println("Sound of elephant is : trumpeting");
	}
	
}

class dog extends petanimal{
	
	public void sound () {
		super.sound();
		System.out.println("Sound of dog is : boww wow");
	}
	
}
public class Super_keyword {

	public static void main(String[] args) {
		
petanimal obj1 = new elephant();
petanimal obj2 = new dog();

obj1.sound();
obj2.sound();
	}

}
