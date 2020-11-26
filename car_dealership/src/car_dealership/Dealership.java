package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		//Write a program to simulate a car dealership sales process
		//We'll have employees, working selling vehicles to customers
		Customer customer1 = new Customer();
		customer1.setName("Tom");
		customer1.setAddress("Detroit");
		customer1.setCashOnHand(150000);
		
		Vehicle vehicle1 = new Vehicle("Toyota","Tacoma", "2016", 120000);
		
		Employee employee1 = new Employee(13, "Anna");
		
		customer1.purchaseCar(vehicle1, employee1, false);
		
		
	}

}
