package neusoftpractice;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("������",19,"��","������ѧ");
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
		System.out.println("[ѧУ]:"+school);
	}
	
//	public void getinfo() {
//		System.out.println("�����getinfo");
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
		System.out.println("[����]:"+name);
		System.out.println("[����]:"+age);
		System.out.println("[�Ա�]:"+sex);
	}

	public void sayHello() {
		System.out.println("���ã�����"+name);
	}
}

interface Consumer {
	public abstract void useCredit();
}