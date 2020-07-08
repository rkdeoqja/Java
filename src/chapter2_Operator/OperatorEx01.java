package chapter2_Operator;

public class OperatorEx01 {
	
	public static void main(String[] args) {
		
		//연산자의 종류중 산술연산자 덧샘 뺄셈 곱셈 나눗셈 나머지 에 대한 계산결과를 저장할수있다.
		int n1;
		n1 = 7;
		
		int n2 = 3;
		
		int result = n1 + n2;
		System.out.println("덧셈결과 : "+result);
		
		result = n1 -n2;
		System.out.println("뺄셈결과 : "+result);
		
		result = n1 *n2;
		System.out.println("곱셈결과 : " +result );
		
		result = n1 / n2;
		System.out.println("나눗셈결과 : "+result);
		
		result = n1 % n2;
		System.out.println("나머지 결과 : "+result);
		
		//위처럼 변수에 계산결과를 바로 대입할수도있지만 아래처럼 출력문에서 바로 계산 하는것도 가능하다
		
		System.out.println("덧셈결과 : "+(n1+n2));
		System.out.println("정수형 나머지: "+7%3);
		System.out.println("실수형 나머지: "+7.2%3.0);
		
	}
}
