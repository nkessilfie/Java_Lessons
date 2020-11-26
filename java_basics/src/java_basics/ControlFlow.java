package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		//programs are executed line by line
		boolean hungry = false;
		
		if(hungry) {
			System.out.println("I'm Starving");
		}
		else {
			System.out.println("Not Hungry");
		}
		
		int hungerRating = 5;
		if (hungerRating < 6) {
			System.out.println("not hungry");
		}
		else {
			System.out.println("Starving...");
		}
		
		int favoriteTemp = 75;
		int currentTemp = 60;
		String opinion;
		
		if(currentTemp < favoriteTemp) {
			opinion = "It's cold outside";
		}
		else if(currentTemp < favoriteTemp - 20) {
			opinion = "A bit cold";
		}
		else if(currentTemp > favoriteTemp){
			opinion = "Hot outside";
		}
		else {
			opinion = "It's a beautiful day";
		}
		
		System.out.println(opinion);
		
		int month = 6;
		String monthString ;
		
		switch (month) {
		
		case 1: monthString = "January";
			break;
		case 2: monthString = "February";
			break;
		case 3: monthString = "March";
			break;
		case 4: monthString = "April";
			break;
		default: monthString = "Unknown Month";
			break;		
	}
		System.out.println(monthString);
	
	
	}

}
