package home.core.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import home.core.*;
import home.core.member.*;

class MemberServiceTest {
	
	MemberService memberService;
	
	@BeforeEach
	void beforeEach() {
		
		AppConfig appConfig = new AppConfig();
		memberService = appConfig.memberService();
	}

	@Test
	void join() {
		
		Member member = new Member(1L, "hjy", Grade.BASIC);
		
		memberService.join(member);
		Member findMember = memberService.findByName(1L);
		
		assertEquals(member, findMember);
	}

}
