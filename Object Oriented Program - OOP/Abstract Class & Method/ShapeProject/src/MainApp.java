import child.Circle;
import child.Triangle;
import parents.Shape;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape lingkaran = new Circle("Biru", 20);
		Shape segitiga = new Triangle(10, 15, "Merah");
		
		System.out.println("Luas Lingkaran berwarna " + lingkaran.getColor() + " adalah " + lingkaran.getArea());
		System.out.println("Luas Segitigas berwarna " + segitiga.getColor() + " adalah " + segitiga.getArea());
	}

}
