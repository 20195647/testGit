package com.neuedu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class TestReflect {

	// ��ȡ����ʱ��Ķ���
	@Test
	public void test1() throws Exception {
		Class clazz = Class.forName("com.neuedu.reflection.Person");

		Object obj = clazz.newInstance();
		Person p = (Person) obj;
		System.out.println(p);
	}

	// ����ָ���Ĺ�������������ʱ��Ķ���
	@Test
	public void test2() throws Exception {
		Class clazz = Person.class;
		Constructor cons = clazz.getDeclaredConstructor(String.class, int.class);
		cons.setAccessible(true);
		Person p = (Person) cons.newInstance("Tom", 20);
		System.out.println(p);
	}

	@Test
	public void test3() throws Exception {
		Class clazz = Class.forName("com.neuedu.reflection.Person");

		// ʵ����һ��Person����������p
		Object obj = clazz.newInstance();
		Person p = (Person) obj;

		// ���÷�public������
		// getDeclaredField(name)�����Ĳ�������������
		Field f1 = clazz.getDeclaredField("name");
		f1.setAccessible(true);

		// ������p��name���Ը�ֵ���൱��p.setName("����")
		f1.set(p, "����");

		// ����public������
		Field f2 = clazz.getField("age");
		f2.set(p, 18);
		// f2.get(p)���൱�ڵ���p.age
		System.out.println(f2.get(p));

		System.out.println(p);
		// ����static������
		Field f3 = clazz.getDeclaredField("desc");
		// f3.get(null)�൱�ڵ�����Person.Desc
		System.out.println(f3.get(null));
		System.out.println(f3.get(p));
	}

	// ����ָ���ķ���
	@Test
	public void test4() throws Exception {
		Class clazz = Class.forName("com.neuedu.reflection.Person");
		Object obj = clazz.newInstance();
		Person p = (Person) obj;

		// ���÷�public�ķ���
		Method m1 = clazz.getDeclaredMethod("getAge");
		m1.setAccessible(true);
		int age = (Integer) m1.invoke(p);
		System.out.println(age);

		// ����public�ķ���
		Method m2 = clazz.getMethod("show", String.class);
		// p.show("�ط�����")
		Object returnVal = m2.invoke(p, "�ط�����");
		System.out.println(returnVal);
		// ����static�ķ���
		Method m3 = clazz.getDeclaredMethod("info");
		m3.setAccessible(true);
//			m3.invoke(Person.class);
//			m3.invoke(p);
		m3.invoke(null);

	}
}
