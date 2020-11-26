package Application;

public class ExceptionHandling {
	
	public static int subtractTenFrom(int number) throws Exception{
		if(number < 10) {
			throw new Exception("----The number passed is less than 10, try again----");
		}
		return number - 10;
	}
	

}
