package constructorinjection.ex001;

import java.util.*;

public class MainApp {
	public static void main(String[] args) {

		MemoryMemberRepository repository = new MemoryMemberRepository();
		Member member1 = new Member();

		member1.setName("spring1");
		repository.save(member1);

		Member member2 = new Member();

		member2.setName("spring2");
		repository.save(member2);
		
		Member member3 = new Member();
		
		member3.setName("spring1");
		repository.save(member3);

		List<Member> list = repository.findByAll();
		
		list.stream().forEach(System.out::println);
	}
}
