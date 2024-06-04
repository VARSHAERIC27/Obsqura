package inheritance;

public class Car extends Vehicle{  //single
	int bulb=5;
	public void light() {
	System.out.println("over speed");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car s1= new Car();
s1.run();
s1.light();
System.out.println(s1.bulb);
System.out.println(s1.speed);
	}

}
