package com.natty.learningcollections;

import java.util.ArrayList;
import java.util.Collections;

public class TraversingLists {
	
	public static void main(String[] args) {
		
		ArrayList <String> animal = new ArrayList<String>();
		animal.add("Lion");
		animal.add("Bird");
		animal.add("Cat");
		animal.add("Dog");
		
		//For each String i in animal
		//Can be used in Array or ArrayList
		for(String i : animal) {
			System.out.println(i);
		}
		
		ArrayList <Vehicle> cars = new ArrayList <Vehicle>();
		cars.add(new Vehicle("Toyota","Vitz", 12000, false));
		cars.add(new Vehicle("Honda","Civic", 11000, true));
		cars.add(new Vehicle("Mitsubishi","Pajero", 18000, true));
		cars.add(new Vehicle("BMW","E5", 9000, false));
		
		for(Vehicle i : cars) {
			System.out.println(i);
		}
		
		Collections.sort(cars);	
		System.out.println(cars);
	}
	
	

}
