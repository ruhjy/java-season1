package school.report.copy;

import java.util.*;

import school.school.*;

public class GenerateGradeReport {

	School school = School.getInstance();
	public static final String TITLE = "수강생 학점\t\t\n";
	public static final String HEADER = "  이름  |  학번   |  중점과목  |  점수 |\n";
	public static final String LINE = "--------------------------------------\n";

	private StringBuffer buffer = new StringBuffer();

	public String getReport() {

		ArrayList<Subject> subjectList = school.getSubjectList();
		for (Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return buffer.toString();

	}

	public void makeHeader(Subject subject) {

		ArrayList<Student> studentList = subject.getStudentList();

		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			buffer.append(student.getMajorSubject().getSubjectName());
			buffer.append(" | ");
		}
	}

}
