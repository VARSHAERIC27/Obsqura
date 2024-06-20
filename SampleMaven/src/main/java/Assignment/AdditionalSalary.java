package Assignment;

public class AdditionalSalary extends Salary {
	float hra;
	float pf;
	public void additional() {
		
		 hra= basicpay*0.05f;
		 pf=0.2f*basicpay;
		// System.out.println("hra ="+hra);
		// System.out.println("pf ="+pf);


}}
