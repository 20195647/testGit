package com.neuedu.reflection;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1、数组打印枚举类
		Season[] seasons = Season.values();

		for (Season season : seasons) {
			System.out.println(season.getName() + "," + season.getDesc());
		}
		// 2、直接访问枚举类
		System.out.println(Season.Spring.toString());
	}
}
