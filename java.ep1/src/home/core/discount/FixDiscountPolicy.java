package home.core.discount;

import home.core.member.*;

public class FixDiscountPolicy implements DiscountPolicy {

	private int discountFixAmount = 1000;

	@Override
	public int discount(Member member, int price) {
		if (member.getGarde() == Grade.VIP) {
			return discountFixAmount;
		} else {
			return 0;
		}
	}

}
