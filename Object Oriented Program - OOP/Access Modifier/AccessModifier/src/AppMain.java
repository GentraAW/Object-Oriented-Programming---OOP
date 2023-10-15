
import childs.Doctor;
import childs.Programmer;
import childs.Teacher;
import parents.Person;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Programmer("Rizky", "Bandung", ".Net Core");
		Person person2 = new Programmer("Joko", "Tegal", "Matematika");
		Person person3 = new Programmer("Eko", "Surabaya", "Pedisctrician");
		
		sayHello(person1);
		sayHello(person2);
		sayHello(person3);
	}
	static void sayHello(Person person) {
		String message;
		if(person instanceof Programmer) {
			Programmer programmer = (Programmer) person;
			message = "HEllo, " + programmer.name + ". Seorang Programmer " + programmer.technology + ".";
		}else if(person instanceof Teacher) {
			Teacher teacher = (Teacher) person;
			message = "HEllo, " + teacher.name + ". Seorang Guru " + teacher.subject + ".";
		}else if(person instanceof Doctor) {
			Doctor doctor = (Doctor) person;
			message = "HEllo, " + doctor.name + ". Seorang Dokter " + doctor.specialist + ".";
		}else {
			message = "Helo, " + person.name + ".";
		}
		System.out.println(message);
	}
}
