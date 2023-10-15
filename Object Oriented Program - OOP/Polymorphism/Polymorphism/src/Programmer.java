
public class Programmer extends Person{
	String technology;
	
	public Programmer() {
		super();
	}

	public Programmer(String technology, String address, String name) {
		super(name, address);
		this.technology = technology;
	}

	void hacking() {
		System.out.println("I can hacking a website");
	}
	
	void coding(){
		System.out.println("I can create a application using technology : " + technology + ".");
	}
	
	void greeting() {
		super.greeting();//Memanggil method greeting dari parent atau Person Class
		System.out.println("My job is a " + technology + " programmer");
	}
}
