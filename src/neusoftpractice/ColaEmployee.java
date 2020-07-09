package neusoftpractice;

import java.io.Serializable;

public class ColaEmployee implements Serializable{
	private String name;// 姓名
	private int birMonth;// 生日月份

	public ColaEmployee(String name, int birMonth) {
		super();
		this.name = name;
		this.birMonth = birMonth;
	}

	public double getSalary(int month) {
		if (month == birMonth) {
			return 100;
		} else {
			return 0;
		}
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "ColaEmployee [name=" + name + ", birMonth=" + birMonth + "]";
	}
	
	
}
