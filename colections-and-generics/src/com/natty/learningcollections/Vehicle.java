package com.natty.learningcollections;

public class Vehicle implements Comparable<Vehicle>{
	String make;
	String model;
	double price;
	boolean fourWheelDrive;
	
	public Vehicle(String make, String model, double price, boolean fourWheelDrive) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.fourWheelDrive = fourWheelDrive;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}
	public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", fourWheelDrive=" + fourWheelDrive
				+ "]";
	}

	@Override
	public int compareTo(Vehicle o) {
		if(this.price > o.price) {
			return -1;
		}
		else if(this.price < o.price) {
			return 1;
		}
		return 0;
	}
	
	
}
