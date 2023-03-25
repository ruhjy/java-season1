package test1;

public class test1111 {
	public static void main(String[] args) {

		interface1 o1 = new test1();
		System.out.println(o1.toString());
		interface1 o2 = null;
//		System.out.println(o2.toString());

		
		interface1 c = new Firecar();
		System.out.println(c.equals(c));
	}

}

interface interface1 {

}

class test1 implements interface1 {

}

class Car {

	void stop() {
		System.out.println("stop");

	}
}

class Firecar extends Car implements interface1{
	void water() {
		System.out.println("water");
	}
}