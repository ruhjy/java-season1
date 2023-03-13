package lambda;

import java.util.function.*;

@FunctionalInterface
interface MyFunction {
	void run();
}

public class Ex14_1 {

	static void execute(MyFunction f) {
		f.run();
	}

	static MyFunction getMyFunction() {
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
//		return () -> System.out.println("f3.run()");
	}

	public static void main(String[] args) {

		MyFunction f1 = () -> System.out.println("f1.run()");

		MyFunction f2 = new MyFunction() {
			@Override
			public void run() {
				System.out.println("f2.run()");
			}
		};

		MyFunction f3 = getMyFunction();

		f1.run();
		f2.run();
		f3.run();
		System.out.println();

		execute(f1);
		execute(() -> System.out.println("run()"));

		Predicate<String> isEmptyStr = t -> (t.length() == 0);
		String s = "";

		if (isEmptyStr.test(s)) {
			System.out.println("This is an empty String.");
		}

	}
}
