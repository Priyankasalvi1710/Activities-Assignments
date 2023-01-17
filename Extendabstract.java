package Abstraction;

public  class Extendabstract extends Abstractclass {

	Extendabstract(String eName, String eAddress, int eID) {
		super(eName, eAddress, eID);
		
	}
	public void jobRole() {
		System.out.println("This is an abstract method");
	}

	public static void main(String[] args) {
		
		Extendabstract e = new Extendabstract("Priyanka","Mumbai",1101);
		e.department();
		e.jobRole();
		
	}

}
