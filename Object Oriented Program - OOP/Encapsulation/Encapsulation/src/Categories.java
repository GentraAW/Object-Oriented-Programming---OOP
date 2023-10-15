
public class Categories {
	//Menggunakan access modifier private pada field atau attribute
	private int id;
	private String name;
	private boolean expensive;
	
	
	public Categories(int id, String name, boolean expensive) {
		super();
		this.id = id;
		this.name = name;
		this.expensive = expensive;
	}
	
	public Categories() {
		super();
	}
	
	//Contoh Getter dan Setter tipe data boolean
	//getter
	public boolean isExpensive() {
		return this.isExpensive();
	}
	
	//setter
	public void setExpensive(boolean expensive) {
		this.expensive = expensive;
	}
	
	//Contoh getter dan setter tipe data object
	//Getter
	public String getName() {
		return this.name;
	}
	
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	
	//Contoh getter dan setter tipe data primitif (integer)
		//Getter
		public int getId() {
			return this.id;
		}
		
		//Setter
		public void setId(int id) {
			this.id = id;
		}
}
