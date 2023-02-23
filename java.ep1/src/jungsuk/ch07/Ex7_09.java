package jungsuk.ch07;

public class Ex7_09 {
	public static void main(String[] args) {

		Buyer2 b = new Buyer2(2_500_000);

		b.buy(new Computer2());
		b.buy(new KeyBoard2());
		b.buy(new Mouse2());
		b.buy(new Computer2());
		System.out.println();

		b.summary();
//		System.out.println("현재 남은 돈은 " + b.getMoney() + "원입니다");
//		System.out.println("현재 보너스점수는 " + b.getBonusPoint() + "점입니다.");
	}
}

class Product2 {
	int price;
	int bonusPoint;

	Product2(int price) {
		this.price = price;
		bonusPoint = (int) (price * 0.05);
	}

	Product2() {
	}
}

class Tv2 extends Product2 {
	Tv2() {
		super(1_000_000);
	}

	public String toString() {
		return "티비";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(1_500_000);
	}

	public String toString() {
		return "컴퓨터";
	}
}

class KeyBoard2 extends Product2 {
	KeyBoard2() {
		super(200_000);
	}

	public String toString() {
		return "키보드";
	}
}

class Mouse2 extends Product2 {
	Mouse2() {
		super(70_000);
	}

	public String toString() {
		return "마우스";
	}
}

class Buyer2 {
	private int money;
	private int bonusPoint;
	Product2[] cart = new Product2[10]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product2배열에 사용될 카운터

	Buyer2(int money) {
		this.money = money;
		bonusPoint = 0;
	}

	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p; // 제품을 Product[] cart에 저장한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null)
				break;
			sum += cart[i].price;
//			itemList += cart[i] + ", ";
			itemList += (i == 0) ? "" + cart[i] : ", " + cart[i];
		}

		System.out.println("구입하신 물품의 총금액은 " + sum + "원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}

	public int getMoney() {
		return money;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}
}