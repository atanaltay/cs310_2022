package carshop;

public class MainClass {

	
	public static void main(String[] args) {
		
		Mechanic mechanic = new Mechanic();
		
		Truck truck1 = new Truck();
		
		Car car1 = new Car();
		
		Motorcycle motorCycle = new Motorcycle();
		
		mechanic.fixVehicle(motorCycle);
		
		System.out.println("-----------");
		
		mechanic.fixVehicle(car1);
		
		System.out.println("-----------");
		
		
		mechanic.fixVehicle(truck1);
		
		System.out.println("--------------------");
		
		Fixable car2 = new Car();
		
		Fixable truck2 = new Truck();
		
		mechanic.fixVehicle(car2);
		mechanic.fixVehicle(truck2);
			
		
	}
	
	
}
