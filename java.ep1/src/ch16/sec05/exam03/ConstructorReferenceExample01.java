package ch16.sec05.exam03;

public class ConstructorReferenceExample01 {
	public static void main(String[] args) {

		Person01 person = new Person01();

		Member m1 = person.getMember1(Member::new);
		System.out.println(m1);

		Member m2 = person.getMember2(Member::new);
		System.out.println(m2);
		
	}
}
