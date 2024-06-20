package interfacepgm;

public class Example2 implements Example1 {
	public void show()
	{
		System.out.println("show");
	}
	public void display()
	{
		System.out.println("display");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 obj= new Example2();
		//Example1 obj= new Example2();
		obj.show();
		System.out.println(obj.a);
		obj.display();

	}

}
