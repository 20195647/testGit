package neusoftpractice;

public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaEmployee[] colaEpls = { new SalariedEmployee("��", 6, 20000), // ����,�����·�,��н
				new HourlyEmployee("��", 5, 100, 300), // ����,�����·�,ʱн,Сʱ��
				new SalesEmployee("��", 7, 100000, 0.3)// ����,�����·�,�����۶�����
		};
		// ����
		for (int i = 0; i < colaEpls.length; i++) {
			new Company().getSalary(colaEpls[i], 7);
		}
	}

}
