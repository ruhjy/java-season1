package ch13_1.exercise.exam03;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println("name : " + name1 + ", job : " + job);

		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age2 = container2.getValue();
		System.out.println("name2 : " + name2 + ", age2 : " + age2);
	}
}
