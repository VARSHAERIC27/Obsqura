package exceptionhandling;

public class ExceptionHandling2 {
	
public static void handle(int a ,int b)  {
	int sum=a+b;
	if(sum>15) {
	throw new ArithmeticException("sum is grater than 50");
}
	else{
		System.out.println("sum is less than 50");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {	
		ExceptionHandling2.handle(33, 5);
	}
	catch(ArithmeticException e) {
		System.out.println(e);

	}
	System.out.println("rest of code");

	}

}
