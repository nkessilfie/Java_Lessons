package Exercise;

public abstract class Animals {
	
	String name;
	int age;
	String gender;
	int weightInPounds;
	
	Fish fishy;
	
	public Animals(String name, int age, String gender, int weightInPounds) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weightInPounds = weightInPounds;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", gender=" + gender + ", weightInPounds=" + weightInPounds
				+ "]";
	}



	public void eat() {
		System.out.println("Eating...");
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}
	
	public void move() {
		System.out.println("Moving...");
	}
	
	public abstract void makeSound();
	

}
