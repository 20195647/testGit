package neusoftpractice;

public class Company {
	public void getSalary(ColaEmployee colaEpl, int month) {
		System.out.println("[" + month + "月" + colaEpl.getName() + 
				"员工的工资：" + colaEpl.getSalary(month) + "元]");
	}
}
