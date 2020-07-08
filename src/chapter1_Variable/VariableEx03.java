package chapter1_Variable;

public class VariableEx03 {

	public static void main(String[] args) {
		
		// double은 실수형 변수타입이다
		// 실수형 변수타입은 float형과 double형이 있고 소수점 뒷자리를 얼마나 정밀하게 표현할수 있는지의 차이가 있다
		// float 	4	3.4E+/-38(7개의 자릿수)
		// double	8	1.7E+/-308(15개의 자릿수)
		double num1;
		double num2;
		double result;
		
		num1 = 11.0000001;
		num2 = 22.0000002;
		
		result = num1+num2;
		
		System.out.println("num1의 값: "+num1); //현재 num1의 값 11.0000001
		System.out.println("num2의 값: "+num2); //현재 num2의 값 22.0000002
		System.out.println("result에 num1과num2를 합한결과를 초기화"+result); 
		//result의 값에는 num1과 num2를 합한 33.(소수점15자리)를 동반한 값이 출력
	}

}
