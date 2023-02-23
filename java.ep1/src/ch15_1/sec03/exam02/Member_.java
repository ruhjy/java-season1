package ch15_1.sec03.exam02;

public class Member_ {
	public String name;
	public int age;

	public Member_(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int hashCode() {
		return name.hashCode() + age;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Member_) {
			Member_ m = (Member_) obj;
			return m.name.equals(name) && m.age == age;
		} else {
			return false;
		}
	}
}
