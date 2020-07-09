package neusoftpractice;

public class Market {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 定义第一类笔记本库存信息
		String legionBrand = "legion-Y7000"; // 品牌型号
		double legionSize = 15.6; // 尺寸
		double legionPrice = 6999.98; // 价格
		String legionConfig = "i7-4G-128G"; // 配置
		int legionCount = 200; // 库存
		
		// 定义第二类笔记本库存信息
		String thinkpadBrand = "thinkpad-T9000"; // 品牌型号
		double thinkpadSiz = 13.3; // 尺寸
		double thinkpadPrice = 9999.99; // 价格
		String thinkpadConfig = "i9-32G-10T"; // 配置
		int thinkpadCount = 150; // 库存信息
		
		// 定义第三类笔记本库存信息
		String ASUSBrand = "ASUS-Z8000   "; // 品牌型号
		double ASUSSize = 18.0; // 尺寸
		double ASUSPrice = 7999.99; // 价格
		String ASUSConfig = "i8-16G-256G"; // 配置
		int ASUSCount = 300; // 库存
		
		// 输出商城库存信息
		System.out.println("-------------------------------商城库存清单-------------------------------------");
		// 输出三种电脑的库存信息
		System.out.println("[商品详细信息]");
		System.out.println("  品牌型号                           尺寸             价格                        配置                          库存");
		System.out.println(
				legionBrand + "    " + legionSize + "   " + legionPrice + "   " + legionConfig + "    " + legionCount + "    ");
		System.out.println(thinkpadBrand + "  " + thinkpadSiz + "   " + thinkpadPrice + "   " + thinkpadConfig + "    "
				+ thinkpadCount + "  ");
		System.out.println(
				ASUSBrand + "   " + ASUSSize + "   " + ASUSPrice + "   " + ASUSConfig + "   " + ASUSCount + "   ");
		// 统计库存商品总数及商品总额
		int totalCount = legionCount + thinkpadCount + ASUSCount;
		double totalMoney = (legionCount * legionPrice) + (thinkpadCount * thinkpadPrice) + (ASUSCount * ASUSPrice);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("[商品汇总信息]");
		System.out.println("库存商品总数 ： " + totalCount + "/台");
		System.out.println("库存商品总额 ： " + totalMoney + "/元");
		System.out.println("-------------------------------------------------------------------------------");
	}
}