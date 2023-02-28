package ch16_1.sec05.exam02;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		person.ordering((a, b) -> a.compareToIgnoreCase(b));
		System.out.println();

		person.ordering(String::compareToIgnoreCase);
	}
}
