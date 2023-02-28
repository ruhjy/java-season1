package ch15_1.sec05.exam03;

public class Person implements Comparable<Person> {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Person o) {
		if (age < o.age) {
			return -1;
		} else if (age == o.age) {
			return 0;
		} else {
			return 1;
		}
	}

}
