package defaultstatic;


interface Vehicle{
	String getBrand();
	
	String speedUp();
	
	String slowDown();
	
	default String turnAlarmOn() { ///backward compatibility no need to implement
		return "turning vehicle alarm on";
	}
	
	default String turnAlarmOf() {
		return "turning vehicle alarm off";
	}
	
	static String getCompany() {
		return "BMW";
	}
}


class  Car implements Vehicle{

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "BmW";
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "the car is speeding up";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "the car is slowing down";
	}
	
}


public class DefaultDemo {
	
	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		System.out.println(vehicle.getBrand());
		System.out.println(vehicle.speedUp());
		System.out.println(vehicle.slowDown());
		System.out.println(vehicle.turnAlarmOn());
		System.out.println(vehicle.turnAlarmOf());
		
		//call a static method
		System.out.println(Vehicle.getCompany());
	}

}
