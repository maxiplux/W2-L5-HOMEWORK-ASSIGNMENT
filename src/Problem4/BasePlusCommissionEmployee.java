package Problem4;

public class BasePlusCommissionEmployee  extends CommissionEmployee{
	double baseSalary;

	@Override
	public double getPayment() {
		
		return this.baseSalary + (this.grossSales*this.commissionRate);
	}
	
}
