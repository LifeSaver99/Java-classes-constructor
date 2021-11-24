
public class Cities {
	private String name = "Berlin";
	private String country = "Germany";
	private String language = "German";
	private int age = 1;
	
	public void displayInformation() {
		String displayMessage = String.format("The name of the city is %s", name);
		System.out.println(displayMessage);
		
	}
	
	public void displayInformation1() {
		String displayMessage = String.format("The city is located in %s", country);
		System.out.println(displayMessage);
		
	}
	
	public void displayInformation2() {
		String displayMessage = String.format("The language widely spoken is %s", language);
		System.out.println(displayMessage);
		
	}
	
	public int increaseAge() {
		age++;
		System.out.println("The age of the city is " + age);
		return age;
	}
}
