package neusoftpractice;

public class HourlyEmployee extends ColaEmployee {
	private int hourSalary;// ÿСʱ�Ĺ���
	private int hourMonthly;// ÿ�¹���Сʱ��

	public HourlyEmployee(String name, int birMonth, int hourSalary, int hourMonthly) {
		super(name, birMonth);
		this.hourSalary = hourSalary;
		this.hourMonthly = hourMonthly;
	}

	public double getSalary(int month) {
		if (hourMonthly > 160) {
			return hourSalary * 160 + hourSalary * (hourMonthly - 160) * 1.5 + super.getSalary(month);
		} else {
			return hourSalary * hourMonthly + super.getSalary(month);
		}
	}

	public int getHourSalary() {
		return hourSalary;
	}

	public void setHourSalary(int hourSalary) {
		this.hourSalary = hourSalary;
	}

	public int getHourMonthly() {
		return hourMonthly;
	}

	public void setHourMonthly(int hourMonthly) {
		this.hourMonthly = hourMonthly;
	}
	
	
}
