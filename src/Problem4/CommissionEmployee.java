package Problem4;

public class CommissionEmployee extends Employee {
	
	double grossSales;
	double commissionRate;
	

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return this.grossSales*this.commissionRate;
	}
	

}
