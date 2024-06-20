package superkeyword;
public class Child  extends Parent{
	String name="eric";

	public Child(int a,int b) {
		//int sum =a+b;
		super(3,5);
		int sum =a+b;
		System.out.println("child class constructor");
		System.out.println(name);
		System.out.println(super.name);
	 System.out.println(age);
		System.out.println(sum);
		super.display();




	}
	public void display() {
		
		System.out.println("child class method");
//super.display();
super.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj2= new Child(4,5);
		obj2.display();
		
	}

}


