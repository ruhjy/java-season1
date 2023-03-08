package ch16.sec02.exam02;

public class Button01 {
	
	Button01() {}

	// 정적 내부 인터페이스
	@FunctionalInterface
	public static interface ClickListener {
		// 추상 메서드
		void onClick();
	}

	// 필드 
	private ClickListener clickListener;

	// setter
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	// 메서드
	public void click() {
		this.clickListener.onClick();
	}

}
