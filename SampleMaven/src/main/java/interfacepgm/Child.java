package interfacepgm;

public class Child implements Interface1,Interface2{
	public  void display() {
		System.out.println("display");
	}
	public  void show() {
		System.out.println("show");

	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj= new Child();
		obj.display();
		obj.show();
		System.out.println(obj.MIN_VALUE);
		System.out.println(obj.MAXVALUE);


		
	}

}
