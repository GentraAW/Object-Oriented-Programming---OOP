package childs;
import parents.Person;

public class Programmer extends Person{
	String technology;
	
	public Programmer() {
		super();
	}

	public Programmer(String technology, String address, String name) {
		super(address, name);
		this.technology = technology;
	}

	public void hacking() {
		System.out.println("I can hacking a website");
	}
	
	public void coding(){
		System.out.println("I can create a application using technology : " + technology + ".");
	}
	
	public void greeting() {
		super.greeting();//Memanggil method greeting dari parent atau Person Class
		System.out.println("My job is a " + technology + " programmer");
	}
}
