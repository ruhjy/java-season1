package constructorinjection.ex001;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class MemoryMemberRepositoryTest02 {

	MemberRepository repository = new MemoryMemberRepository();

	@Test
	void save() {
		Member member = new Member();
		member.setName("spring");
		repository.save(member);

		Member result = repository.findByName("spring").get();

		Assertions.assertEquals(result, member);
	}

	@Test
	void findById() {
		Member member = new Member();
		member.setName("spring1");
		repository.save(member);

		Member result = repository.findById(1L).get();
		Assertions.assertEquals(result, member);
	}

}
