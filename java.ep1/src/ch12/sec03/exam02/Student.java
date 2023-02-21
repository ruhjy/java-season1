package ch12.sec03.exam02;

import java.util.Objects;

public class Student {
	private int no;
	private String name;

	public Student() {
	}

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

//	@Override
//	public int hashCode() {
//		return no + name.hashCode();
//	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student target) {
			if (no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}

}
