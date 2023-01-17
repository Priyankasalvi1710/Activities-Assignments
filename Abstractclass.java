package Abstraction;

public abstract class Abstractclass {
	
	String eName;
	String eAddress;
	int eID;
	
	Abstractclass(String eName, String eAddress, int eID)
	{
		this.eName = eName;
		this.eAddress = eAddress;
		this.eID =eID;
	}
	
	public void department() {
		System.out.println("This employee work for ST department");
	}

	public abstract void jobRole();
}
