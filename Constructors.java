
public class Constructors {
String name;
String sex;
String color;
int animalAge;

	
public Constructors(String Name, String Sex, String Color, int AnimalAge) {
	name = Name;
	sex= Sex;
	color = Color;
	animalAge=AnimalAge;
}
	public static void main(String [] args) {
		Constructors Lion = new Constructors("Kev","Male","Red",23);
		Constructors Cat = new Constructors("Cindy","Male","Red",23);
		System.out.println(Lion.name);
		System.out.println(Cat.sex);
		
		
	}
}	