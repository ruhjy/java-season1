package home.core;

import home.core.discount.*;
import home.core.member.*;
import home.core.order.*;
import home.core.repository.*;

public class AppConfig {

	public MemberService memberService() {
		return new MemberServiceImpl(memberRepository());
	}

	public OrderService orderService() {
		return new OrderServiceImpl(memberRepository(), discountPolicy());
	}

	public MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}

	public DiscountPolicy discountPolicy() {
		return new RateDiscountPolicy();
	}
}
