package Application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
//		Scanner text = new Scanner(System.in);
//		System.out.println("Enter Text: ");
//		String enteredText = text.nextLine();
//		System.out.println(enteredText);
//		text.close();
		
		File file = new File("myfile.txt");
		try {
			Scanner input = new Scanner(file);
			
			while(input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("problem reading file / file does not exist");
		}
		
		try {
			System.out.println(ExceptionHandling.subtractTenFrom(9));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
