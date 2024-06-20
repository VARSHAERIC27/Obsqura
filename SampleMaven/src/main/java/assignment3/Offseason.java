package assignment3;

public class Offseason extends Onseason{
public void discount(int b) {
		float offdiscount=b*.4f;
		System.out.println("offseason discount="+offdiscount);
		super.discount(10000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Offseason obj= new Offseason();
		obj.discount(6000);
	}

}
