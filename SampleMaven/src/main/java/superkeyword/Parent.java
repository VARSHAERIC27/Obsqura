package superkeyword;

public class Parent {
	String name="varsha";
	int age=3;
	public Parent(int a,int b) {
		int parentsum= a+b;
		
		System.out.println("parent sum"+parentsum);

		System.out.println("parent class constructor");
	}
	public void display() {
		System.out.println("parent class method");

	}
	public void show() {
		System.out.println("parent class method2");

	}

}
