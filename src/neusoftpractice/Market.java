package neusoftpractice;

public class Market {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �����һ��ʼǱ������Ϣ
		String legionBrand = "legion-Y7000"; // Ʒ���ͺ�
		double legionSize = 15.6; // �ߴ�
		double legionPrice = 6999.98; // �۸�
		String legionConfig = "i7-4G-128G"; // ����
		int legionCount = 200; // ���
		
		// ����ڶ���ʼǱ������Ϣ
		String thinkpadBrand = "thinkpad-T9000"; // Ʒ���ͺ�
		double thinkpadSiz = 13.3; // �ߴ�
		double thinkpadPrice = 9999.99; // �۸�
		String thinkpadConfig = "i9-32G-10T"; // ����
		int thinkpadCount = 150; // �����Ϣ
		
		// ���������ʼǱ������Ϣ
		String ASUSBrand = "ASUS-Z8000   "; // Ʒ���ͺ�
		double ASUSSize = 18.0; // �ߴ�
		double ASUSPrice = 7999.99; // �۸�
		String ASUSConfig = "i8-16G-256G"; // ����
		int ASUSCount = 300; // ���
		
		// ����̳ǿ����Ϣ
		System.out.println("-------------------------------�̳ǿ���嵥-------------------------------------");
		// ������ֵ��ԵĿ����Ϣ
		System.out.println("[��Ʒ��ϸ��Ϣ]");
		System.out.println("  Ʒ���ͺ�                           �ߴ�             �۸�                        ����                          ���");
		System.out.println(
				legionBrand + "    " + legionSize + "   " + legionPrice + "   " + legionConfig + "    " + legionCount + "    ");
		System.out.println(thinkpadBrand + "  " + thinkpadSiz + "   " + thinkpadPrice + "   " + thinkpadConfig + "    "
				+ thinkpadCount + "  ");
		System.out.println(
				ASUSBrand + "   " + ASUSSize + "   " + ASUSPrice + "   " + ASUSConfig + "   " + ASUSCount + "   ");
		// ͳ�ƿ����Ʒ��������Ʒ�ܶ�
		int totalCount = legionCount + thinkpadCount + ASUSCount;
		double totalMoney = (legionCount * legionPrice) + (thinkpadCount * thinkpadPrice) + (ASUSCount * ASUSPrice);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("[��Ʒ������Ϣ]");
		System.out.println("�����Ʒ���� �� " + totalCount + "/̨");
		System.out.println("�����Ʒ�ܶ� �� " + totalMoney + "/Ԫ");
		System.out.println("-------------------------------------------------------------------------------");
	}
}