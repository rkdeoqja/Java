package chapter1_variable;

public class VariableEx05 {

	public static void main(String[] args) {
		
		float num1 = 1.23456789f; //실수형 변수의 기본값이 double이기때문에  리터럴 f를붙여줘야 한다
		double num2 = 1.23456789; //double은 실수형 변수의 기본형이기 때문에 리터럴을 붙여주지 않아도 된다.
		
		System.out.println("float형 변수 num1: "+num1);
		System.out.println("double형 변수 num2: "+num2);
		
		int integer = 2147483647; //기본자료형  변수 int의 범위
		long L0ng = 2147483647; //long자료형은 인트의 범위 안에서는 리터럴을 표시해주지 않아도 오류가 나지 않지만
		long L0ng1 = 2147483648l;  //int 의 범위를 넘어서는 경우에는 l이라는 리터럴을 붙여줘야 오류가 나지않는다
		
		
	}

}
