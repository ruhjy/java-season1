package home.core.discount;

import home.core.member.*;

public interface DiscountPolicy {

	int discount(Member member, int itemPrice);
}
