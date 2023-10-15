
public class Doctor extends Person{
	String specialist;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Doctor(String specialist, String name, String address) {
		super(name, address);
		this.specialist = specialist;
	}

	void surgery() {
		System.out.println("I can surgery operation patients.");
	}
	
	void greeting() {
		super.greeting();//Memanggil method greeting dari parent atau Person Class
		System.out.println("My job is a " + specialist + ".");
	}
}
