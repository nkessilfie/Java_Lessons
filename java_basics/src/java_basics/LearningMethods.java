package java_basics;

import someOtherPackage.ExampleClass;

public class LearningMethods {

	public static void main(String[] args) {
		String print = MyUtils.printSomeJunk("Pass Me Here");
		MyUtils.sumTwoNumbers(2,3);
//		int var = MyUtils.add10(30);
//		System.out.println(var);
		System.out.println(print);
		
		
		ExampleClass.doSomething();
		System.out.println();
		
		//Instance of add10 method from MyUtils class
		MyUtils var = new MyUtils();
		var.add10(30);
		
	}
	
}
