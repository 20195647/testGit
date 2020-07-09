package com.neuedu.reflection;

public enum Season {

	// 直接写名+()
	Spring("春天", "3-5月"), Summer("夏天", "6-8月"), Fall("秋天", "9-11月"), Winter("冬天", "12-2月");

	// private final
	private final String name;
	private final String desc;

	// private
	private Season(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public String toString() {
		return name + "," + desc;
	}
}
