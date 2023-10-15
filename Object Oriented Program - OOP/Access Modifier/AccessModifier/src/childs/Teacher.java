package childs;
import parents.Person;

public class Teacher extends Person{
	public String subject;
	
	public Teacher() {
		super();
	}

	public Teacher(String subject, String address, String name) {
		super(name, address);
		this.subject = subject;
	}

	public void teaching() {
		System.out.println("I can teach " + subject + ", So anyone how wants to learn can talk to me.");
	}
	
	public void greeting() {
		super.greeting();//Memanggil method greeting dari parent atau Person Class
		System.out.println("My job is a " + subject + ".");
	}
}
