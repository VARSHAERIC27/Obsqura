package abstraction;

public class Sample2 extends Sample1 {
	
	public void show() {
		System.out.println("abstract method implementation");
	}
	public void student() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 obj= new Sample2();
		obj.show();
		obj.display();
		obj.student();
	}

}
