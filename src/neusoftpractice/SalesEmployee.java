package neusoftpractice;

public class SalesEmployee extends ColaEmployee {
	private int monthSales;// �����۶�
	private double royaltyRate;// �����

	public SalesEmployee(String name, int birMonth, int monthSales, double royaltyRate) {
		super(name, birMonth);
		this.monthSales = monthSales;
		this.royaltyRate = royaltyRate;
	}

	public double getSalary(int month) {
		return monthSales * royaltyRate + super.getSalary(month);
	}

	public int getMonthSales() {
		return monthSales;
	}

	public void setMonthSales(int monthSales) {
		this.monthSales = monthSales;
	}

	public double getRoyaltyRate() {
		return royaltyRate;
	}

	public void setRoyaltyRate(double royaltyRate) {
		this.royaltyRate = royaltyRate;
	}
	
	
}
