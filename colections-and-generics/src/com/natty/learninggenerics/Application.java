package com.natty.learninggenerics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		Container<String, Integer> container = new Container<>("bear", 24);
		
		String val1 = container.getItem1();
		int val2 = container.getItem2();
		
		Set <String> mySet1 = new HashSet <>();
		mySet1.add("First");
		mySet1.add("Second");
		mySet1.add("Third");
		
		Set <String> mySet2 = new HashSet <>();
		mySet2.add("First");
		mySet2.add("Second");
		mySet2.add("Third");
		mySet2.add("Fourth");
		
		Set<String> resultSet = union(mySet1, mySet2);
		
		Iterator <String> itr = resultSet.iterator();
		while(itr.hasNext()) {
			String var = itr.next();
		}
	}
	
	//Creating Generic  Methods - take a look at the syntax
	public static <E> Set <E> union(Set <E> set1, Set <E> set2) {
		Set <E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}

}
