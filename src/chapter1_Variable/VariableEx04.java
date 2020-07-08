package chapter1_Variable;

public class VariableEx04 {

	public static void main(String[] args) {
		
		int num1 = 0xA0F; 	//16진수 표기법
		int num2 = 0752;	//8진수 표기법
		int num3 = 752;		//10진수 표기법
		
		System.out.println(num1); //출력은 10진수로 출력
		System.out.println(num2); //출력은 10진수로 출력
		System.out.println(num3); //출력은 10진수로 출력
		//지수 표기법 *아주 큰숫자나 아주 작은 숫자를 표기할때는 지수표기법을 사용
		double e1 = 1.7e+3; 
		double e2 = 1.7e-3; 
		
		System.out.println("실수e+지수: "+e1);//실수e+지수: 실수 *10의 거듭제곱이며 1.7e+3이라면 1.7 * 1000 = 1700.0으로 출력
		System.out.println("실수e-지수: "+e2);//실수e-지수: 실수 *(1/10의 거듭제곱)이며 1.7e-3이라면 1.7*(1/1000) = 0.0017으로 출력
		
	
	}

}
