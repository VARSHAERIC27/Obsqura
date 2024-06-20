package exceptionhandling;

public class ThrowsUnchecked {
	public static void handle1() throws ArithmeticException  {
		throw new ArithmeticException("exception occured");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsUnchecked.handle1();
		//System.out.println("rest of code");
	}

}
