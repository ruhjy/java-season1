package home.core.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import home.core.*;
import home.core.member.*;
import home.core.order.*;
import home.core.order.Order;

class OrderServiceTest {

//	MemberService memberService = new MemberServiceImpl();
//	OrderService orderService = new OrderServiceImpl();

	private MemberService memberService;
	private OrderService orderService;

	@BeforeEach
	void beforeEach() {
		AppConfig appConfig = new AppConfig();

		memberService = appConfig.memberService();
		orderService = appConfig.orderService();
	}

	@Test
	void createOrder() {

		Long memberId = 1L;
		Member member = new Member(memberId, "memberA", Grade.VIP);

		memberService.join(member);
		Order order = orderService.createOrder(memberId, "itemA", 10000);

		assertEquals(order.getDiscountPrice(), 1000);
	}

}
