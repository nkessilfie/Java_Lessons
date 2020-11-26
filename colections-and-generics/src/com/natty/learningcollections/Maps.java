package com.natty.learningcollections;

import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		TreeMap <String, String> dictionary = new TreeMap <String, String> ();
		dictionary.put("brave", "courageous");
		dictionary.put("brilliant", "intelligent");
		dictionary.put("joy", "so much ecstacy");
		dictionary.put("strong", "forceful");
		
		for (Map.Entry<String,String> i : dictionary.entrySet()) {
			System.out.println(i.getKey() +" : "+ i.getValue());
		}
	}

}
