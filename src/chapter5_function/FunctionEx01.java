package chapter5_function;

public class FunctionEx01 {
	//보통은 메서드는 다른 클래스에 정의해놓고 사용하나 한눈에 보기 쉽게 한페이지에 작성
	// 접근제한자       반환타입    메소드명 (입력 형태)
	public static void tellTime(int hour) {
		System.out.println("즐거운 하루입니다.");
		System.out.println("지금은 "+hour+"시 입니다.");
	}
	//같은 이름을 이용하여 매개변수의 갯수나 입력형태를 다르게 하여 오버로딩 할 수 있다.
	public static void tellTime(int hour,int minute) {
		System.out.println("공부 할 시간입니다.");
		System.out.println("지금은 "+hour+"시 "+minute+"분 입니다.");
	}

	public static void main(String[] args) {
		
		tellTime(11);
		tellTime(12);
		tellTime(13);
		
		
		tellTime(16,35); 
		int hour=16;
		int minute= 35;
		tellTime(hour,minute); // 위처럼 사용할수도 있지만 해당타입의 변수에 저장된 값을 사용할수도 있다.
		
		
		
		
	}

}
