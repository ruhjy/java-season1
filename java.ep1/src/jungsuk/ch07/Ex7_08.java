package jungsuk.ch07;

public class Ex7_08 {
	public static void main(String[] args) {

		Buyer b = new Buyer(2_500_000);

		b.buy(new Computer());
		b.buy(new KeyBoard());
		b.buy(new Mouse());
		System.out.println();
		System.out.println("현재 남은 돈은 " + b.getMoney() + "원입니다");
		System.out.println("현재 보너스점수는 " + b.getBonusPoint() + "점입니다.");
	}
}

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price * 0.05);
	}
}

class Tv1 extends Product {
	Tv1() {
		super(1_000_000);
	}

	public String toString() {
		return "티비";
	}
}

class Computer extends Product {
	Computer() {
		super(1_500_000);
	}

	public String toString() {
		return "컴퓨터";
	}
}

class KeyBoard extends Product {
	KeyBoard() {
		super(200_000);
	}

	public String toString() {
		return "키보드";
	}
}

class Mouse extends Product {
	Mouse() {
		super(70_000);
	}

	public String toString() {
		return "마우스";
	}
}

class Buyer {
	private int money;
	private int bonusPoint;

	Buyer(int money) {
		this.money = money;
		bonusPoint = 0;
	}

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
	}

	public int getMoney() {
		return money;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}
}