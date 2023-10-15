import parents.Person;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		//person1.name = "Rizki"; //salah, tidak bisa
		person1.setName("Rizki"); //Ini baru benar
		person1.setAddress("Bandung"); //benar
		
		//System.out.println(person1.name); //Salah, karena field name private
		System.out.println(person1.getName()); //Benar, cara memanggil atau menggunakan field name
		System.out.println(person1.getAddress());
	}
	
	/*
	static void sayHello(Person person) {
		String message;
		if(person instanceof Programmer) {
			Programmer programmer = (Programmer) person;
			message = "Hello, " + programmer.name + ". Seorang Programmer " + programmer.getTechnology() + ".";
		}else if(person instanceof Teacher) {
			Teacher teacher = (Teacher) person;
			message = "Hello, " + teacher.name + ". Seorang Guru " + teacher.getSubject() + ".";
		}else if(person instanceof Doctor) {
			Doctor doctor = (Doctor) person;
			message = "Hello, " + doctor.name + ". Seorang Doktor " + doctor.getSpecialist() + ".";
		}else {
			message = "Hello, " + person.name + ".";
		}
		System.out.println(message);
	}
	*/
}
