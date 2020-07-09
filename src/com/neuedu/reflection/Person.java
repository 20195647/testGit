package com.neuedu.reflection;

public class Person {
	private String name;
	public int age;
	static String desc = "�����й���";

	public Person() {
		name = null;
		age = 0;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void info() {
		System.out.println("�й���");
	}

	public void show(String desc) {
		System.out.println(desc);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
