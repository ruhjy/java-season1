package ch16.sec02.exam02;

public class ButtonExample01 {
	public static void main(String[] args) {

		// Ok 버튼 객체 생성
		Button01 btnOk = new Button01();

		// Ok 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
		btnOk.setClickListener(() -> {
			System.out.println("OK 버튼을 클릭했습니다.");
		});
		
		btnOk.click();
		
		Button01 btnCancel = new Button01();
		
		btnCancel.setClickListener(() -> {
			System.out.println("취소");
		});
		
		btnCancel.click();
	}
}
