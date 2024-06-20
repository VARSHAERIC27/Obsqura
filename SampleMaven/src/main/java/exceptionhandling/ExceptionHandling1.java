package exceptionhandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		int a=4;
		int b=5;
		try {
		int c[]=new int[5];
		c[8]=13;
		int div= (a+b)/0;

		}
		catch(ArithmeticException e) {
			System.out.println(e);

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array size is 5");

		}
		catch(Exception e) {
			System.out.println(e);

		}
		finally {
			System.out.println("final block  excuted");

		}
		
		System.out.println("hello");



	}

}
