package Inheritance;

class animal{
	{
		System.out.println(" class cat");
	}
	public void catname() {
		System.out.println("im cat my name is snowbell");
	}
	public void eat() {
		System.out.println("i like to eat fish");
	}
	public void sound() {
		System.out.println("cat speak: meow ");
	}
}
class dog extends animal{
	
	public void dogname() {
		System.out.println("im dog my name is sheru");
	}
	public void eat() {
		System.out.println("i like to eat meat");
	}
}

public class Single_inheritance {

	public static void main(String[] args) {
		
		dog obj = new dog();
		obj.catname();
		obj.sound();
		{
			System.out.println(" class dog");
		}
		obj.dogname();
		obj.eat();

	}

}
