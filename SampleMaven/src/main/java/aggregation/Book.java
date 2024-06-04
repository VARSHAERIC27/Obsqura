package aggregation;

public class Book {
	String bookname;
	int price;
	Author au; //reference variable
	public Book(String bookname,int price,Author au) {
		this.bookname=bookname;
		this.price=price;
		this.au=au;
		
	}

	
	public void show() {
		System.out.println(bookname);
		System.out.println(price);
		System.out.println(au.name);
		System.out.println(au.age);
		System.out.println(au.place);


}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Author obj1= new Author("jose",25,"thrissur");
Book obj2 = new Book("mayavi",20,obj1);
obj2.show();
	}

}
