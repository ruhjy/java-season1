package home.core.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import home.core.*;
import home.core.discount.*;
import home.core.member.*;

class RateDiscountPolicyTest {

	private DiscountPolicy discountPolicy;

	@BeforeEach
	void beforeEach() {
		AppConfig appConfig = new AppConfig();

		discountPolicy = appConfig.discountPolicy();
	}

	@Test
	void vip_o() {

		Member member = new Member(1L, "memberA", Grade.VIP);

		int discount = discountPolicy.discount(member, 30000);

		assertEquals(discount, 3000);

	}

	@Test
	void vip_x() {

		Member member = new Member(1L, "memberA", Grade.BASIC);

		int discount = discountPolicy.discount(member, 30000);

		assertEquals(discount, 0);

	}

}
