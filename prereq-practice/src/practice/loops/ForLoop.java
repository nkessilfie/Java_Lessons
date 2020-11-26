package practice.loops;

public class ForLoop {

	public static void main(String[] args) {
		String name = "Nathaniel";
		
//		for (int i = 0; i < name.length(); i++) {
//			System.out.println(name.charAt(i));
//		}
		
		for (int i = name.length()-1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}
		
		

	}
	

}
