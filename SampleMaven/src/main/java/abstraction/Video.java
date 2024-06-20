package abstraction;

public class Video  extends Google{
	public void search() {
		System.out.println("GOOGLE IS SEARCHING...");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video obj= new Video();
		obj.search();
		Image obj1= new Image();
		obj1.display();
	}

}
