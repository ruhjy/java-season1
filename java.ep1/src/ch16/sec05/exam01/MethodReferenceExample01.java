package ch16.sec05.exam01;

public class MethodReferenceExample01 {
	public static void main(String[] args) {

		Person01 person = new Person01();

		person.action((x, y) -> x + y);
		
		// 정적 메서드 람다식
		person.action((x, y) -> Computer.staticMethod(x, y));
		
		// 정석 메서드 참조
		person.action(Computer::staticMethod);
		
		Computer01 com = new Computer01();
		
		// 인스턴스 메서드 람다식
		person.action((x, y) -> com.instanceMethod(x, y));

		// 인스턴스 메서드 참조
		person.action(com::instanceMethod);
		
		
	}
}
