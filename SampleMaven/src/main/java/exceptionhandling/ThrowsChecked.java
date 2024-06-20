package exceptionhandling;

import java.io.IOException;

public class ThrowsChecked {
	public static void check() throws IOException  {
		throw new IOException("DEVICE ERROR");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ThrowsChecked.check();
		//System.out.println("rest of code");

	}

}
