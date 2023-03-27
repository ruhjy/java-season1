package test1;

public class Lambda001 {
	public static void main(String[] args) {
		
		RunSomething r1 = new RunSomething() {
			@Override
			public int doit(int number) {
				return number + 10;
			}
		};
		
		RunSomething r2 = (number) -> {
			return number + 15;
		};
		
		RunSomething r3 = number -> {
			return number + 20;
		};
		
		RunSomething r4 = number -> number + 30;
		
		System.out.println(r1.doit(5));
		System.out.println(r2.doit(5));
		System.out.println(r3.doit(5));
		System.out.println(r4.doit(5));
		
		
	}
}

@FunctionalInterface
interface RunSomething {
	int doit(int number);
}