package childs;
import parents.Person;
public class Teacher extends Person{
	private String subject;
	
	public Teacher() {
		super();
	}

	public Teacher(String subject, String address, String name) {
		super(name, address);
		this.subject = subject;
	}

	void teaching() {
		System.out.println("I can teach " + subject + ", So anyone how wants to learn can talk to me.");
	}
	
	void greeting() {
		System.out.println("Hello my name is " + getName() + ".");
		System.out.println("I come from " + getAddress() + ".");
		System.out.println("My job is a " + subject + ".");
	}
	
	//getter and setter
	public String getSubject() {
		return this.subject;
	}
	public void setSubject() {
		this.subject = subject;
	}
}
