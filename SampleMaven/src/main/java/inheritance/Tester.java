package inheritance;

public class Tester extends Employee{  //hierarchial
	
	public void room1() {
		System.out.println("high performance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester obj= new Tester();
		obj.room1();
		obj.office();
		Developer obj1 = new Developer();
		obj1.room2();
		//obj1.office();
		
	}

}
