package firstproject;
class shape{
	void display() {
		System.out.println("Displaying Shape");
	}
}
class circle extends shape{
	void showShape() {
		System.out.println("circle");
	}
}
class square extends shape{
	void showShape() {
		System.out.println("square");
	}
}

public class superEx {

	public static void main(String[] args) {
		square s=new square();
		s.showShape();
		s.display();

	}

}
