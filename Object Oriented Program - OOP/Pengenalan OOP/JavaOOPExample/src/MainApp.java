

public class MainApp {

	public static void main(String[] args) {
		//Deklarasi objek dari class Person
		Person person1 = new Person();
		person1.name = "Gentra";
		//person1.age = 23;
		person1.address = "Lembang";
		
		//Membuat objek dari class Person menggunakan Constructor Parameter
		Person person2 = new Person("Lionel", "Cikidang");
		person2.sayHello("Padepokan 79");
		System.out.println(person2.sayAddress());
		System.out.println("--------------------------\n");
		
		//Membuat objek dari class person menggunakan Constructor Default
		person1.name = "Jokokendil";
		person1.sayHello("Padepokan 79");
		person1.address = "Yogyakarta";
		System.out.println(person1.sayAddress());
		System.out.println("--------------------------\n");
		
		//Membuat objek dari class person menggunakan Constructor satu parameter
		Person person3 = new Person("Budi");
		person3.address = "Bandung";
		person3.sayHello("Padepokan 79");
		System.out.println(person3.sayAddress());
		
		
		//Membuat object dari method return pada class person
		person1.myHobby();
		System.out.println("--------------------------");
		
		System.out.println(person1.name);
		System.out.println(person1.address);
		System.out.println(person1.country);
		System.out.println(person1.hobby);
		
		System.out.println("--------------------------");
		person1.sayHello("Padepokan 79");
		System.out.println(person1.sayHobby());
		//memanggil nilai method return dari class Person
		System.out.println(person1.sayAddress());
		System.out.println("--------------------------");
		
	}

}
