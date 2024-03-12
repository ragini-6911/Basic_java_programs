package javaapplication;

public class constructorExample {
	int id;
	String name;
	public constructorExample() {
		System.out.println("Details of Employee");
	}
	public constructorExample(int id,String name)
	{
		this();
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println("id is "+ id +" "+"name is "+ name);
	}
	
	

	public static void main(String[] args) {
		constructorExample ob= new constructorExample(2000, "Ragini");
		ob.display();

	}

}
