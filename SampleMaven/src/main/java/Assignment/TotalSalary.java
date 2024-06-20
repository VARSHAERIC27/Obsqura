package Assignment;

public class TotalSalary  extends AdditionalSalary{
	float total;
	public void total() {
		total=( basicpay+hra-pf-deduction+bonus);
		//System.out.println("total salay="+total);
		
	}
	public void Salaryslip() {
		System.out.println("salary slip --------- ");
		System.out.println("basicpay ="+basicpay);
		 System.out.println("deduction ="+deduction);
		 System.out.println("bonus ="+bonus);
		 System.out.println("hra ="+hra);
		 System.out.println("pf ="+pf);
		System.out.println("total salay by hand="+total);

}
	
    public static void main(String[] args) {
		TotalSalary obj3= new TotalSalary();
		obj3.employee();
		obj3.additional();
		obj3.total();
		obj3.Salaryslip();

		}}
