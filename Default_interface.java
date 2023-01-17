package Abstraction;

 interface Vehicle {
    
    String getBrand();
    
    String speedUp();
    
    String slowDown();
    
    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }
    
    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }
}

public class Default_interface implements Vehicle {

	private String brand;
	
	 public String getBrand() {
	        return "BMW";
	    }
	    
	    
	    public String speedUp() {
	        return "The car is speeding up.";
	    }
	    
	 
	    public String slowDown() {
	        return "The car is slowing down.";
	    }
	
	public static void main(String[] args) {
		
		Vehicle car = new Default_interface();
	    System.out.println(car.getBrand());
	    System.out.println(car.speedUp());
	    System.out.println(car.slowDown());
	    System.out.println(car.turnAlarmOn());
	    System.out.println(car.turnAlarmOff());

	}

}
