package Problem4;

public class HourlyEmployee extends Employee {
	double wage;
	double hours;
	
	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return this.wage*this.hours;
	}
	

}
