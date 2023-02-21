package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1);
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
		Student s2 = new Student(1, "홍길동");
		hashSet.add(s2);
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
		Student s3 = new Student(2, "홍길동");
		hashSet.add(s3);
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
		// Student 클래스의 오버라이딩한 hashcode메서드 주석처리시
		// 객체 중복 제거 x
	}
}
