package javaapplication;

public class setGetEx {
	int id;
	String name;
	void setName(String sname) {
		
		name=sname;
	}
	
	String getName() {
		return name;
	}
	void setid(int id) {
		
		this.id=id;
	}
	
	int getid() {
		return id;
	}

	public static void main(String[] args) {
		setGetEx obEx=new setGetEx();
		obEx.setName( "Ragini");
		System.out.println(obEx.getName());
		setGetEx obEx2=new setGetEx();
		obEx.setid( 2000);
		System.out.println(obEx.getid());
		
		

	}

}
