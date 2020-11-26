package Exercise;

public class Zoo {

	public static void main(String[] args) {
		
		Animals bird = new Bird("Parry", 19, "Male", 15);
		Animals fish = new Fish("Fingerling", 4, "Male", 5);
		
//		fish.move();
//		bird.move();
		
		System.out.println(fish.toString());
		
		Chicken chicken = new Chicken("Halo", 12, "Female", 19);
		Sparrow bazzy = new Sparrow("Raid", 11, "Female", 20);
		chicken.flying();
		
//		chicken.makeSound();
//		bazzy.flying();
		
		soundAnimal(chicken);
		soundAnimal(bazzy);
	

	}
	
	public static void soundAnimal(Animals animal) {
		animal.makeSound();
	}

}
