package school.school;

import java.util.*;

public class School {

	private static School instance;

	private ArrayList<Student> studentList = new ArrayList<>();
	private ArrayList<Subject> subjectList = new ArrayList<>();

	private School() {
	}

	public static School getInstance() {
		if (instance == null) {
			instance = new School();
		}
		return instance;
	}

	public void addStudent(Student student) {
		studentList.add(student);
	}

	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}

}
