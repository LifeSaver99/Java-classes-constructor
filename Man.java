
public class Man {

	private String name = "Ade";
	private int Hunger = 15;
	private int Strength = 15;
	private int Speed = 15;
	private int Stamina = 15;

	
	public void displayInformation() {
		String displayMessage = String.format("My Name is %s", name);
		System.out.println(displayMessage);
		}

	public void Eat() {
		Hunger -= 5;
		System.out.println("my hunger Level after eating " + Hunger);
		
	}

	public void Gym() {
		Strength += 10;
		System.out.println("my strength level after exercise " + Strength);
	}

	public void Run() {
		Speed--;
		System.out.println("my speed level after running " + Speed);
	}

	public void Play() {
		Stamina--;
		System.out.println("my stamina level after playing " + Stamina);
	}
}


