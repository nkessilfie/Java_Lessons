package car_dealership;

public class Employee {
	int employeeNumber;
	String employeeName;
	
	public Employee(int employeeNumber, String employeeName) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
	}

	public static void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
		if (finance == true) {
			double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
			runCreditHistory(customer, loanAmount);
		}
		else if (vehicle.getPrice() <= customer.getCashOnHand()){
			processTransaction(customer, vehicle);
		}
		else {
			System.out.println("Not enough funds");
		}
	}
	
	public static void runCreditHistory(Customer customer, double loanAmount) {
		if(loanAmount > 0) {
		System.out.println("Not enough cash on hand but " + customer.getName() + " has been approved by his bank for a loan of " + loanAmount + " to complete purchase");
		}
		else {
			System.out.println("I'm sorry, you can't finance this transaction");
		}
	}
	
	public static void processTransaction(Customer customer, Vehicle vehicle) {
		customer.getCashOnHand();
		System.out.println("Transaction Completed");
		System.out.println(vehicle.toString() + " ---------- PURCHASED");
	}

}
