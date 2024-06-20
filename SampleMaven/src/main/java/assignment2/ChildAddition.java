package assignment2;

public class ChildAddition extends ParentAddition{
	
	
	public void checkingdivisibility() {
		int c=super.addition(10,20);
		if(c%10==0) {
		System.out.println("addition result is divisible by 10");
	}
		else {
			System.out.println("addition result is  not divisible by 10");

		}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAddition obj= new ChildAddition();
		obj.checkingdivisibility();
	}

}
