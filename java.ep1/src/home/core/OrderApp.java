package home.core;

import home.core.member.*;
import home.core.order.*;

public class OrderApp {
	public static void main(String[] args) {

		MemberService memberService = new MemberServiceImpl();
		OrderService orderService = new OrderServiceImpl();

		Long MemberId1 = 1L;
		Long MemberId2 = 2L;

		Member member1 = new Member(MemberId1, "memberA", Grade.VIP);
		Member member2 = new Member(MemberId2, "memberB", Grade.BASIC);

		memberService.join(member1);
		memberService.join(member2);
		Order order1 = orderService.createOrder(MemberId1, "itemA", 20000);
		Order order2 = orderService.createOrder(MemberId2, "itemB", 20000);
		
		System.out.println("memberA  = " + order1.getDiscountPrice());
		System.out.println(order1);
		System.out.println();
		
		System.out.println("memberB = " + order2.getDiscountPrice());
		System.out.println(order2);
	}
}
