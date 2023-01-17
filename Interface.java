package Abstraction;

interface employees{
	
	public void department ();
	void jobRole();
}

public class Interface implements employees{
	
	public void department() {
		System.out.println("Department: ST");
	}

	public void jobRole() {
		System.out.println("job role: Software testing enigneer");
	}
	public static void main(String[] args) {
		
		Interface e = new Interface();
		
		e.department();
		e.jobRole();

		
	}

}
