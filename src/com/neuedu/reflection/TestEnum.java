package com.neuedu.reflection;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1�������ӡö����
		Season[] seasons = Season.values();

		for (Season season : seasons) {
			System.out.println(season.getName() + "," + season.getDesc());
		}
		// 2��ֱ�ӷ���ö����
		System.out.println(Season.Spring.toString());
	}
}
