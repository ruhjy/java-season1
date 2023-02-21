package jungsuk.ch11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));

		System.out.println(set);
	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}

		
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person p)) return false;
		p = (Person) obj;
		return name.equals(p.name) && age == p.age;
		
		// Object obj = p.name;
	}

}
