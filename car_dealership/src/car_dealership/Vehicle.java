package car_dealership;

public class Vehicle {
	
	private String model;
	private String make;
	private String yearOfManufacture;
	private double price;
	
	public Vehicle(String model, String make, String yearOfManufacture, double price) {
		super();
		this.model = model;
		this.make = make;
		this.yearOfManufacture = yearOfManufacture;
		this.price = price;
	}
		
	@Override
	public String toString() {
		return "Vehicle To Be Purchased [model=" + model + ", make=" + make + ", yearOfManufacture=" + yearOfManufacture + ", price="
				+ price + "]";
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(String yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
