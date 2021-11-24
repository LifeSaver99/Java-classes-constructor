
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man Ade = new Man ();
		Cities Manchester = new Cities();
		Animal Lion = new Animal("joe",23,23,23,23,23);
		Lion lion = new Lion("jack",54,56,78,76,56,15);
		
		lion.run();
		Lion.run();
		System.out.println(Lion.strength);
		Ade.displayInformation();
		Ade.Eat();
		Ade.Gym();
		Ade.Run();
		Ade.Play();
		Manchester.displayInformation();
		Manchester.displayInformation1();
		Manchester.displayInformation2();
		Manchester.increaseAge();
	}

}
