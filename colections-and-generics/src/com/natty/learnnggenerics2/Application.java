package com.natty.learnnggenerics2;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		//Demonstrating Polymorphism
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;
		
		//Generics are different
		ArrayList<Employee> employees = new ArrayList<>();
		ArrayList<Accountant> accountants = new ArrayList<>();
//		employees = accountants;
		
		//implementing wild cards - unknown type
		ArrayList<?> employees2 = new ArrayList<>();
		employees2 = accountants;
		
		//another way of implementing wild card with complex datatypes
		ArrayList<? extends Employee> employees3 = new ArrayList<>();
		
		//lowest datatype is Employee i.e employee or their parent
		ArrayList<? super Employee> employees4 = new ArrayList<>();
		
		
		
	}
	
	public ArrayList<Employee> everyWorking(ArrayList<Employee> emp){
		
		for(Employee i: emp) {
			i.doWork();
		}
		return emp;
		
	}
}
