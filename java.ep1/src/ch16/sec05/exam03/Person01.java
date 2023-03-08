package ch16.sec05.exam03;

public class Person01 {
	public Member getMember1(Creatable01 creatable) {
		String id = "winter";
		Member member = creatable.create(id);
		return member;
	}

	public Member getMember2(Creatable02 creatable) {
		String id = "winter";
		String name = "한겨울";
		Member member = creatable.create(id, name);
		return member;
	}
}
