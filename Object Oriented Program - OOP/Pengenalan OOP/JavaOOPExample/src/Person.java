import java.util.Scanner;

public class Person {
	Scanner keyboard = new Scanner(System.in);
	String name;
	Integer age;
	String address;
	String hobby;
	final String country = "Indonesia";
	
	//Constructor Default
	Person(){
		
	}
	//Constructor dengan satu parameter
	Person(String paramName){
		name = paramName;
	}
	//Constructor Dengan dua Parameter
	Person(String paramName, String paramAddress){
		this(paramName);
		address = paramAddress;
	}
	
	//Method return dengan input hobby
	String myHobby() {
		System.out.print("\nInput my hobby : ");
		hobby = keyboard.next();
		return "My hobby " + hobby;
	}
	//Method return value (Mengembalikan Nilai)
	String sayHobby() {
		return "My hooby is, " + hobby + ".";
	}
	
	
	//Method void
	void sayHello(String paramName) {
		System.out.println("Hello " + paramName + ", Myname is "
	+ name + ".");
	}
	
	//Method return value (Mengembalikan Nilai)
	String sayAddress() {
		return "I, come from " + address + ".";
	}
	
	
}
