public class GettersNSetters {
String name;
int age;

	public static void main(String[] args) {
		GettersNSetters a = new GettersNSetters();
		a.SetName("Ade");
		a.SetAge(31);
		System.out.println(a.Getage());
		System.out.println(a.Getname());
		a.MyDetails();

	}
	public void SetName(String name) {
	 this.name = name;
	}
	
	public String Getname() {
		return name;
	}
	
	public void SetAge(int age) {
		 this.age = age;
		}
		
	public int Getage() {
			return age;
		}
	public void MyDetails() {
		System.out.println("My name is "+ Getname()+ " I am "+ Getage()+ "years old.");
	}
	
}
