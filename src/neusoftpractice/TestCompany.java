package neusoftpractice;

public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaEmployee[] colaEpls = { new SalariedEmployee("甲", 6, 20000), // 姓名,生日月份,月薪
				new HourlyEmployee("乙", 5, 100, 300), // 姓名,生日月份,时薪,小时数
				new SalesEmployee("丙", 7, 100000, 0.3)// 姓名,生日月份,月销售额，提成率
		};
		// 遍历
		for (int i = 0; i < colaEpls.length; i++) {
			new Company().getSalary(colaEpls[i], 7);
		}
	}

}
