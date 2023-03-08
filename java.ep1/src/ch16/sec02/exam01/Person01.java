package ch16.sec02.exam01;

public class Person01 {
	public void action(Workable01 workable) {
		System.out.println("start");
		workable.work();
		System.out.println("end");
	}
}
