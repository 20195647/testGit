package neusoftpractice;

public class SalariedEmployee extends ColaEmployee {
	private double monthSalary;// ÔÂÐ½

	public SalariedEmployee(String name, int birMonth, double monthSalary) {
		super(name, birMonth);
		this.monthSalary = monthSalary;
	}

	public double getSalary(int month) {
		return this.monthSalary + super.getSalary(month);
	}

	public double getMonthSalary() {
		return monthSalary;
	}

	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}
	
}
