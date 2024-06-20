package abstraction;

public class GoogleChild extends Google {
	public void search() {
		System.out.println("GOOGLE IS SEARCHING...");
	}
	public void image() {
		System.out.println(" image");

	}
	public void video() {
		System.out.println(" video");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoogleChild obj= new GoogleChild();
		obj.search();
		obj.image();
		obj.video();
		
	}

}
