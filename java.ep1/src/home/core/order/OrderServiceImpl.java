package home.core.order;

import home.core.discount.*;
import home.core.member.*;
import home.core.repository.*;

public class OrderServiceImpl implements OrderService {

//	MemberRepository memberRepository = new MemoryMemberRepository();
//	DiscountPolicy discountPolicy = new FixDiscountPolicy();

	private final MemberRepository memberRepository;
	private final DiscountPolicy discountPolicy;

	public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
		this.memberRepository = memberRepository;
		this.discountPolicy = discountPolicy;
	}

	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {

		Member member = memberRepository.findById(memberId);
		int discountPrice = discountPolicy.discount(member, itemPrice);
		return new Order(memberId, itemName, itemPrice, discountPrice);
	}

}
