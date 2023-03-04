package jungsuk.ch07;

import jungsuk.ch07.OuterClass.*;

public class Ex7_12 {
	public static void main(String[] args) {

		System.out.println(OuterClass.InstanceInner.CONST);
		System.out.println(OuterClass.InstanceInner.cv);
		System.out.println(OuterClass.InstanceInner.class.getTypeName());
		System.out.println(OuterClass.StaticInner.cv);

		OuterClass o1 = new OuterClass();
		OuterClass.InstanceInner ii = o1.new InstanceInner();
		System.out.println(ii.iv);
		System.out.println(ii.cv);
		System.out.println(ii.CONST);
		
		OuterClass.StaticInner si = new OuterClass.StaticInner();
	}
}

class OuterClass {
	class InstanceInner {
		int iv = 100;
		static int cv = 100;
		final static int CONST = 100;
	}

	static class StaticInner {
		int iv = 200;
		static int cv = 200;
	}

	void myMethod() {
		class LocalInner {
			int iv = 300;
			static int cv = 300;
			final static int CONST = 300;
		}
	}

}