package constructorinjection.ex001;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

class MemoryMemberRepositoryTest01 {
	
	MemberRepository repository = new MemoryMemberRepository();
	
	@Test
	void save() {
		Member member = new Member();
		member.setName("memberA");
		repository.save(member);
		
		
	}

	
}
