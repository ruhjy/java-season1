package home.core.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.*;

import home.core.discount.*;
import home.core.member.*;

class RateDiscountPolicyTest {
	
	DiscountPolicy discountPolicy = new RateDiscountPolicy();

	@Test
	@DisplayName("vip는 10% 할인이 적용되어야 한다.")
	void vip_o() {
		
		Member member = new Member(1L, "hk", Grade.VIP);
		
		int discount = discountPolicy.discount(member, 20000);
		
		Assertions.assertEquals(discount, 2000);
	}
	
	@Test
	@DisplayName("vip가 아니면 할인이 적용되지 않아야 한다.")
	void vip_x() {
		
		Member member = new Member(1L, "hjy", Grade.BASIC);
		
		int discount = discountPolicy.discount(member, 20000);
		
		Assertions.assertEquals(discount, 0);
		
	}

}
