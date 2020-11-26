package Exercise;

public class Sparrow extends Bird implements Flyable{

	public Sparrow(String name, int age, String gender, int weightInPounds) {
		super(name, age, gender, weightInPounds);
	}

	@Override
	public void flying() {
		System.out.println("Sparrow flying...");
		
	}
	
	

}
