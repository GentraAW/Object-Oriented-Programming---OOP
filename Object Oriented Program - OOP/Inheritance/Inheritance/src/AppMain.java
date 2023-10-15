
import childs.Doctor;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Doctor doctor1 = new Doctor();
	doctor1.name = "Jefri";
	doctor1.address = "Kopo";
	doctor1.specialist = "Specialist Gigi";
	
	//Contoh object doctor menggunakan Constructor berparameter
	Doctor doctor2 = new Doctor("Cardiologist", "Elis", "Ledeng");
	
	System.out.println("----------Coba Output---------");
	doctor1.greeting();
	System.out.println();
	doctor2.greeting();
	System.out.println("------------------------------");
	
	
	}

}
