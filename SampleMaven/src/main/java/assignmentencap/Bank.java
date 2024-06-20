package assignmentencap;

public class Bank {
	private int pin;
	
	
	public void setter(int pin) {
		this.pin=pin;
		
	}
	public void getter() {
		System.out.println(pin);
		

	}
	public  void validate(int a,int b,int c) {
		if (pin==a||pin==b||pin==c) {
			System.out.println("valid pin");

	}
		else {
			System.out.println("not valid pin");

		}

}}
