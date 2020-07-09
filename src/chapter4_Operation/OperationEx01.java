package chapter4_Operation;

public class OperationEx01 {

	public static void main(String[] args) {
		
		int n = 10;
		//if else 문
		
		//if(true){ if 의 조건식이 참이라면 if 레인지 안에있는 출력문이 출력된다 
		//if의 조건식이 거짓이라면  else문 안의 것 들을 실행한다.
		
		if(n > 5) {
			System.out.println("n은 5보다 크다."); 
		}else {
			System.out.println("n은 5보다 작다");
		}
		//아래와 같이 사용할수도 있다. 
		if(n < 5) System.out.println("n은 5보다 작다.");
		else System.out.println("n은 5보다 크다");
		
		
		System.out.println("시스템 종료");
	}

}
