package ch15.question.q8;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

//	 여기에 코드를 작성하세요.
	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student student)) {
			return false;
		}
		student = (Student) obj;
		if (studentNum != student.studentNum) {
			return false;
		}
		return true;
	}

}
