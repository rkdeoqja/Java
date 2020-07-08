package chapter1_Variable;

public class VariableEx08 {

	public static void main(String[] args) {
		
		 
		byte b1 = 127;
		byte b2 = 127;
		// byte b3 = b1 + b2; byte의 범위를 벗어나서 오류가 발생한다

		//프로모션
		int i1 = b1+b2; //byte보다 큰 자료형이기 때문에 자료에 손실이 발생하지않으며 자동으로 형변환이 이루어진다
		System.out.println(i1);
		System.out.println(b1+b2);
		System.out.println();
		
		short s1 = 12345; 
		short s2 = 12345;
		int i2 = s1+s2; //short보다 큰자료형이기 때문에 자동형변환 프로모션이 이루어진다
		System.out.println(i2);
		System.out.println();
		
		int int2 =12345;
		double d1 = 100.5;
		double resultd = int2+d1; //int보다 double의 자료형이 크기 때문에 int2의 12345값이 12345.0으로 형변환이 이루어져서 계산된다.
		
	}

}
