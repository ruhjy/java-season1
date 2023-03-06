package home.core.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import home.core.*;
import home.core.member.*;
import home.core.repository.*;

class MemberServiceTest {

//	MemberService memberService = new MemberServiceImpl();
	private MemberService memberService;

	@BeforeEach
	void beforeEach() {
		AppConfig appConfig = new AppConfig();
		memberService = appConfig.memberService();
	}

	@Test
	void join() {

		Member member = new Member(1L, "member1", Grade.VIP);

		memberService.join(member);
		Member findMember = memberService.findByName(1L);

		assertEquals(member.getName(), findMember.getName());

	}

}
