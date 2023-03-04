package home.core.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import home.core.*;
import home.core.member.*;
import home.core.order.*;
import home.core.order.Order;

class OrderServiceTest {

	OrderService orderService;
	MemberService memberService;
	
	@BeforeEach
	void beforeEach() {
		
		AppConfig appConfig = new AppConfig();
		memberService = appConfig.memberService();
		orderService = appConfig.orderService();
	}

	@Test
	void createOrderBasic() {

		Long memberId = 1L;

		Member member = new Member(memberId, "hjy", Grade.BASIC);
		
		memberService.join(member);
		Order order = orderService.createOrder(memberId, "itemA", 20000);

		assertEquals(order.getDiscountPrice(), 0);
	}
	
	@Test
	void createOrderVip() {
		
		Long memberId = 1L;
		
		Member member = new Member(memberId, "hk", Grade.VIP);
		memberService.join(member);
		
		Order order = orderService.createOrder(memberId, "itemB", 20000);
		
		assertEquals(order.getDiscountPrice(), 1000);
	}

}
