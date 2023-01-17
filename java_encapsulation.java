package Encapsulation;
class bike{
private int speed;
private String modelName;
private int mileage;

public int getBikeSpeed(){
    return speed;
}
public String getBikeModelName(){
    return modelName;
}
public int getBikeMileage(){
    return mileage;
}
public void setBikeMileage(int newValue){
	mileage = newValue;
}

public void setBikeModelName(String newValue){
	modelName = newValue;
}

public void setBikeSpeed(int newValue){
	speed = newValue;
}
}
public class java_encapsulation {

	public static void main(String[] args) {
		bike obj = new bike();
		obj.setBikeModelName("Royal Enfield Hunter 350");
        obj.setBikeSpeed(114);
        obj.setBikeMileage(36);
        System.out.println("Bike model Name: " + obj.getBikeModelName());
        System.out.println("Bike speed kmph: " + obj.getBikeSpeed());
        System.out.println("Bike mileage kmpl: " + obj.getBikeMileage());

	}

}
