package com.neuedu.utiltest;

public class TestObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int i = Integer.parseInt("200");//字符串转换为基本数据类型
		System.out.println(i);
		String s=Integer.toString(2000);//基本数据类型转换为字符串
		System.out.println(s);
		
		String s1="0.5";
		String s2="12";
		double x =Double.parseDouble(s1);
		System.out.println(s2+x);
	}

}