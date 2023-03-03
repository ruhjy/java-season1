package ch15_2.sec06.exam01;

import java.util.*;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>(); // Last In First Out (LIFO)
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(500));

		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println(coin.getValue() + "원");
		}
	}
}
