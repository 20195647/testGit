package com.neuedu.reflection;

public enum Season {

	// ֱ��д��+()
	Spring("����", "3-5��"), Summer("����", "6-8��"), Fall("����", "9-11��"), Winter("����", "12-2��");

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
