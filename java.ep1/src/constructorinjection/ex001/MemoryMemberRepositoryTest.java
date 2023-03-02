package constructorinjection.ex001;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

class MemoryMemberRepositoryTest {

	MemoryMemberRepository repository = new MemoryMemberRepository();

	@AfterEach
	public void afterEach() {
		repository.clearStore();
	}

	@Test
	void save() {
		Member member = new Member();
		member.setName("spring");

		repository.save(member);

		Member result = repository.findById(member.getId()).get();
		assertEquals(result, member);
	}

	@Test
	void findByName() {
		Member member1 = new Member();
		member1.setName("memberA");
		repository.save(member1);

		Member member2 = new Member();
		member2.setName("memberB");
		repository.save(member2);

		Member result1 = repository.findByName("memberA").get();
		assertEquals(result1, member1);

		Member result2 = repository.findByName("memberB").get();
		assertEquals(result2, member2);

		Member result3 = repository.findById(1L).get();
		assertEquals(result3, member1);

		Member result4 = repository.findById(2L).get();
		assertEquals(result4, member2);
	}

	@Test
	void findByAll() {
		Member member1 = new Member();
		member1.setName("spring1");
		repository.save(member1);

		Member member2 = new Member();
		member2.setName("spring2");
		repository.save(member2);

		List<Member> result = repository.findByAll();
		assertEquals(result.size(), 2);

	}

}
