package home.core.order;

import home.core.discount.*;
import home.core.member.*;

public class OrderServiceImpl implements OrderService {
	
	MemberRepository memberRepository = new MemoryMemberRepository();
	DiscountPolicy discountPolicy = new FixDiscountPolicy();

	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {
		
		Member member = memberRepository.findById(memberId);
		int discountPrice = discountPolicy.discount(member, itemPrice);
		
		return new Order(memberId, itemName, itemPrice, discountPrice);
	}

}
