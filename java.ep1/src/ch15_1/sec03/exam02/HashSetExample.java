package ch15_1.sec03.exam02;

import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.swing.text.SimpleAttributeSet;

import ch15_1.sec03.exam01.Member;

public class HashSetExample {
	public static void main(String[] args) {

		// HashSet 컬렉션 생성
		Set<Member> set = new HashSet<>();

		// Member 객체 저장
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체 수 : " + set.size());
		
	}
}
