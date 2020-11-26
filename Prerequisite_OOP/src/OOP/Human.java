package OOP;

public class Human {
	
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	public Human(String name, int age, int heightInInches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}
	
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", heightInInches=" + heightInInches + ", eyeColor=" + eyeColor
				+ "]";
	}



	public void speak() {
		System.out.println("Speaking...");
	}

	public void eat() {
		System.out.println("Eating...");
	}
	
	public void walk() {
		System.out.println("Walking...");
	}
	
	public void work() {
		System.out.println("Working...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeightInInches() {
		return heightInInches;
	}

	public void setHeightInInches(int heightInInches) {
		this.heightInInches = heightInInches;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

}
