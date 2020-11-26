package Exercise;

public class Bird extends Animals {

	public Bird(String name, int age, String gender, int weightInPounds) {
		super(name, age, gender, weightInPounds);
		
	}

	@Override
	public void makeSound() {
		System.out.println("Squeaking...");
		
	}
	
	


}
