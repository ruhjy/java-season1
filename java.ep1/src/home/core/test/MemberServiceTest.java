package home.core.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import home.core.member.*;

class MemberServiceTest {
	
	MemberService memberService = new MemberServiceImpl();

	@Test
	void join() {
		
		Member member = new Member(1L, "hjy", Grade.BASIC);
		
		memberService.join(member);
		Member findMember = memberService.findByName(1L);
		
		assertEquals(member, findMember);
	}

}
