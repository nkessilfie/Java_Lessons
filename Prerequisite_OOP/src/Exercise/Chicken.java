package Exercise;

public class Chicken extends Bird implements Flyable{

	public Chicken(String name, int age, String gender, int weightInPounds) {
		super(name, age, gender, weightInPounds);
	}

	@Override
	public void flying() {
		System.out.println("Chicken flapping...");
		
	}
	
	
	

}
