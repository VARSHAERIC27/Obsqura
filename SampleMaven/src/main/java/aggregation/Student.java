package aggregation;

public class Student {
	String name;
	int age;
	Address add;
	public Student(String name,int age,Address add) {
		this.name=name;
		this.age=age;
		this.add =add;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address obj1 = new Address("palathingal",15,"irinjalakuda",680121);
Student obj2= new Student("aira",1,obj1);
obj2.display();

	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(add.housename);
		System.out.println(add.housenum);
		System.out.println(add.place);
		System.out.println(add.pincode);





	}

}
