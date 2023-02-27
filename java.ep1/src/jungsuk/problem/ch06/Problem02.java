package jungsuk.problem.ch06;

public class Problem02 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);

		String str = s.info();
		System.out.println(str);
	}
}

// 다음과 같은 실행결과를 얻도록 Student 클래스에 생성자와 info() 작성
// 실행결과 : 홍길동,1,1,100,60,76,236,78.7

class Student {
	String name;
	int ban;
	int no;
	int kor, eng, math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public float getAvg() {
		return  (int)(getTotal() / 3f * 100 + 0.5);
//		return (int)((float)getTotal() / 3f *100 / 100f;
	}

	public String info() {
		return name + "," + ban + "," + no + "," + kor + ","
				+ eng + "," + math + "," + getTotal()
				+ "," + getAvg();
	}
}