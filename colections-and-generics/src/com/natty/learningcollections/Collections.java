package com.natty.learningcollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		
		List <Integer> numbers = new ArrayList<Integer>();
		numbers.add(34);
		numbers.add(12);
		numbers.add(44);
		
//		System.out.println(numbers.get(0) + numbers.get(1));
		
		LinkedList <String> words = new LinkedList <String>();
		words.add("Chale");
		words.add("Man");
		words.add("For Chop");
		
	
		
		System.out.println(words);
		
		//Replacing an element in the set
//		words.set(2, "Cho");
//		System.out.println(words.get(2));
	}

}
