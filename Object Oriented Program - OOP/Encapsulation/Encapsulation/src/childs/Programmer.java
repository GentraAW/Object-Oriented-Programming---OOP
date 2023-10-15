package childs;
import parents.Person;

public class Programmer extends Person{
	private String technology;
	
	public Programmer() {
		super();
	}

	public Programmer(String technology, String address, String name) {
		super(address, name);
		this.technology = technology;
	}

	void hacking() {
		System.out.println("I can hacking a website");
	}
	
	void coding(){
		System.out.println("I can create a application using technology : " + technology + ".");
	}
	
	void greeting() {
		System.out.println("Hello my name is " + getName() + ".");
		System.out.println("I come from " + getAddress() + ".");
		System.out.println("My job is a " + technology + " programmer");
	}
	//getter dan setter

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	
}
