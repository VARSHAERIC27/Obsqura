package polymorphisam;

public class Child  extends Parent{
public void sum(int c,int d) {
	int sum=c+d;
		System.out.println("child sum="+sum);
		super.sum(5, 6);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child obj =new Child();
		Parent obj =new Child();

		obj.sum(3, 4);
		
	}

}
