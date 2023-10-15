package childs;
import parents.Person;

public class Doctor extends Person{
	private String specialist;
	
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
		System.out.println("Hello my name is " + getName() + ".");
		System.out.println("I come from " + getAddress() + ".");
		System.out.println("My job is a " + specialist + ".");
		
	}
	
	//setter and getter
	public String getSpecialist() {
		return this.specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
}
