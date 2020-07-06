package chapter1_variable;

public class VariableEx01 {

	public static void main(String[] args) {
		
		int num ; //변수 선언
		num = 20; //num이라는 변수에 20이라는 값으로 초기화;
		
		System.out.println(num); //result : num에는  20이라는 값이 들어가 20으로 출력
		
		num = 30; // num이라는 변수에 30이라는 값을 대입
		
		System.out.println(num); //result : 위 출력 결과 밑에 초기화를 해주었으니 위의 출력은 20으로 표기되고 현재 라인만 30으로 출력
		
		int number = 2000; // number변수를 생성과 동시에 2000의 값으로 초기화
		
		System.out.println(number); //result: 2000출력
		
		int no;
		//System.out.println(no); // no변수는 초기화 되지않아 오류 발생
		no = 10000;
		
		System.out.println(no); // 초기화를 해주었기 때문에 10000을 출력한다
		
		
		
	}

}
