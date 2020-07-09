package neusoftpractice;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("包哲铭",19,"男","东北大学");
		student.getinfo();
		student.sayHello();
		student.useCredit();
		student.study();
	}

}

class Student extends Person implements Consumer {
	private String school;

	public Student(String name, int age, String sex, String school) {
		super(name, age, sex);
		this.school = school;
	}

	public void useCredit() {
		System.out.println("Use Credit");
	}

	public void study() {
		System.out.println("[学校]:"+school);
	}
	
//	public void getinfo() {
//		System.out.println("子类的getinfo");
//	}
}

class Person {
	private String name;
	private int age;
	private String sex;

	public Person(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public void getinfo() {
		System.out.println("[姓名]:"+name);
		System.out.println("[年龄]:"+age);
		System.out.println("[性别]:"+sex);
	}

	public void sayHello() {
		System.out.println("您好，我是"+name);
	}
}

interface Consumer {
	public abstract void useCredit();
}