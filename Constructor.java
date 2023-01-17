package learning;

public class Constructor {
	
	private String name,n1,n2;

	  
	  Constructor() {
	    System.out.println("Constructor types:");
	    name = "Default constructor";
	     n1= "Parameterized constructor";
	     n2 = "Non-Arg constructor";
	    
	  }

	  public static void main(String[] args) {

	    
		  Constructor obj = new Constructor();
	    System.out.println("1 " + obj.name);
	    System.out.println("2 " + obj.n1);
	    System.out.println("3 " + obj.n2);
	  }
	}


		




