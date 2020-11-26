package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		int value = 0;
		//variable can take only one element
		
		int [] values = new int [100]; //array with 100 slots
		values[0] = 1000;
		//all unassigned slots are initialized to 0
		values[99] = 3000;
		
		System.out.println(values[99]);
		
		//other forms of array declaration
		String [] words = new String [] {"My", "name", "is"};
		
		//print the last element in array
		System.out.println(words[2]);
	}

}
