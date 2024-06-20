package polymorphisam;

public class Cricket extends Sports {
public void play() {
	System.out.println("cricket play");
super.play();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sports obj= new Cricket(); upcasting 
		Cricket obj= new Cricket();

		obj.play();
		Football obj1 = new Football();
		obj1.play();
	}

}
