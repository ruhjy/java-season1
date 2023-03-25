package test1;

import java.util.*;

public class Test001 {
	public static void main(String[] args) {

		Comparator<Student> comp1 = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}
		};

		Comparator<Student> comp2 = (o1, o2) -> o1.getAge() - o2.getAge();

		List<Student> studentlist = new ArrayList<>();
		studentlist.add(new Student(10, 3));
		studentlist.add(new Student(8, 1));
		studentlist.add(new Student(13, 6));
		studentlist.add(new Student(9, 2));
		studentlist.add(new Student(12, 5));
		studentlist.add(new Student(11, 4));

		int compare = comp3.compare(studentlist.get(0), studentlist.get(1));
		System.out.println(compare);
	}

	public static Comparator<Student> comp3 = (o1, o2) -> o1.getAge() - o2.getAge();

	public static Comparator<Student> comp4 = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getClassNumber() - o2.getClassNumber();
		}
	};
}

class Student {

	private int age;
	private int classNumber;

	public Student(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

}
