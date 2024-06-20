package encapsulation;

public class Sample1 {
	private int mark;
	private String depart;
	private String name;
	public void setter(int mark,String depart,String name) {
		this.mark=mark;
		this.depart=depart;
		this.name=name;
	}
	public void getter() {
		System.out.println(mark);
		System.out.println(depart);
		System.out.println(name);


	}

	
}
