package inheritance;

public class Babydog extends Dog { //multilevel
	int limit=1;
	public void limit1() {
	System.out.println("two");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Babydog  obj = new Babydog();
		obj.limit1();
		System.out.println(obj.limit);
		obj.animal();
		obj.dog1();
		
		
	}

}
