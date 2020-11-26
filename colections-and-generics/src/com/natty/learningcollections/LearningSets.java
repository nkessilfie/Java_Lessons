package com.natty.learningcollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class LearningSets {

	public static void main(String[] args) {
		HashSet <Integer> values = new HashSet <Integer>();
		values.add(12);
		values.add(16);
		values.add(43);
		values.add(43);
		
		for(Integer i : values) {
			System.out.println(i);
		}
		
		LinkedHashSet <Integer> numbers = new LinkedHashSet <Integer>();
		numbers.add(12);
		numbers.add(16);
		numbers.add(43);
		numbers.add(43);
		
		for(Integer i : numbers) {
			System.out.println(i);
		}
		
		//convert from HashSet to ArrayList
		List <Integer> li = new ArrayList <Integer>(numbers);
		
		System.out.println(li);
	}
	

}
