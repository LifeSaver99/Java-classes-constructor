
public class Animal {
	String name;
	int age;
	int hungerLevel;
	int speed;
	int strength;
	int tiredness;

	public Animal(String Name, int Age, int HungerLevel, int Speed, int Strength, int Tiredness) {
		name = Name;
		age = Age;
		hungerLevel = HungerLevel;
		speed = Speed;
		strength = Strength;
		tiredness = Tiredness;

	}

	public void run() {
		System.out.println("i am running");
	}

}

class Lion extends Animal {
	int clawStrength;

	public Lion(String Name, int Age, int HungerLevel, int Speed, int Strength, int Tiredness, int ClawStrength) {
		super(Name, Age, HungerLevel, Speed, Strength, Tiredness);
		clawStrength = ClawStrength;
	}

}
