package Exercise;

public class Fish extends Animals{

	public Fish(String name, int age, String gender, int weightInPounds) {
		super(name, age, gender, weightInPounds);
		
	}
	
	public void move() {
		System.out.println("Swimming...");
	}

	@Override
	public void makeSound() {
		System.out.println("no sounds...");
		
	}
	
	

}
