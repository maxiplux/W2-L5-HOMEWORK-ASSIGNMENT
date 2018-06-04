package Problem4;

public class SalariedEmployee extends Employee {
	double weeklySalary;
	

	@Override
	public double getPayment() {
		
		return this.weeklySalary;
	}
	
}
