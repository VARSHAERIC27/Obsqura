package accessmodifier;

public class Accessmethod {
	protected int a=2;
	 protected void display() {
		System.out.println("a="+a);
		}
		public static void main(String args[]) {
			Accessmethod obj = new Accessmethod();
			obj.display();
		}
	}


