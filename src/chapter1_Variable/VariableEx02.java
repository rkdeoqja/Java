package chapter1_Variable;

public class VariableEx02 {

	public static void main(String[] args) {
		
		byte num1 = 127;
		byte num2 = -128;
		
		//기본자료형 변수타입 byte가 담을수 있는 범위는 -128~127로 정해져있다
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		num1++; //++은 증감연산자의 한종류로 앞에 붙이면 선행 증가 뒤에 붙이면 후행 증가
		num2--; //--역시 증감연산자의 한종류로 앞에 붙이면 선행 감소 뒤에 붙이면 후행 감소
		
		System.out.println("1 증가한뒤에 num1: "+num1);
		System.out.println("1 감소한뒤에 num2: "+num2);
		//result : num1의 경우 byte가 담을수있는 범위를 넘어서 오버플로우 발생 -128로 출력   
		//         num2 역시 byte가 담을 수 있는 범위를 넘어서 언더플로우 발생 127로 출력
		
		num1--;
		num2++;
		
		System.out.println("1 감소한뒤에 num1: "+num1);
		System.out.println("1 증가한뒤에 num2: "+num2);
		//result : num1은 또다시 -128까지의 범위를 넘어서  언더플로우 발생 127로 출력 
		//		 : num2 역시 127의 범위를 넘어서 오버플로우 발생 -128로 출력
		
	}

}
