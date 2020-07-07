package chapter2_operator;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		
		//복합대입 연산자를 사용하려면 대입연산자의 앞에 산술연산자를 붙여주면 된다 
		//복합대입 연산자의 종류에는  +=, -=, *=, /=, %= 이 있다.  
		
		int num1 = 7;
		int num2 = 7;
		int num3 = 7; 
		
		num3 =- 3;
		System.out.println("=-의 연산 결과: "+num3); //=-은 -를 해라 처럼 보이지만 실제로는 - 3을 대입하는 대입연산자로 사용되었다
		
		num1 = num1 - 3;
		System.out.println("-의 연산결과: "+num1); // = num1 -3 은 각각의 대입연산자와 산술연산자로 사용되었다.
		
		num2 -= 3 ;
		System.out.println("-=의 연산결과: "+num2); // 먼저 -를 한후 =대입하라는 복합대입연산자로 사용되었다.
		
		
	}

}
