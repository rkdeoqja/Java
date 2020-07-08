package chapter1_Variable;

public class VariableEx09 {

	public static void main(String[] args) {
		//디모션 
		
		byte b1 = 125;
		byte b2 = 125;
		byte result_byte = (byte)(b1+b2); 
		
		//byte의 범위를 넘어선 값을 byte에 명시적 형변환을 통해 집어 넣을때에는 자료의 손실이 이루어질수있다
		
		System.out.println(result_byte); //몸집보다 작은 자료형에 들어간 결과 값이 -6이 되었다
		System.out.println(b1+b2);		//원래의 값은 250인걸 알수있다
		System.out.println();
		
		short s1 = 1234; 
		short s2 = 1234;
		short result_short = (short)(s1+s2); // 정수 자료형인 byte short는 int로 프로모션 되어져 계산되기 때문에 
		byte b3 = 1;						 // int 보다 작은 자료형인 byte와 short에 자료를 넣고싶을때에는
		byte b4 = 1;						 // 범위안에 있더라도 큰자료형에서 작은 자료형으로 디모션되는것이기 때문에 명시적형변환을 시켜줘야한다
		byte resultbyte1 =(byte)(b3+b4);
		System.out.println(result_short); //범위안에 들어가는 값을 넣어서 손실된 값은 없다
		System.out.println(s1+s2);		
		System.out.println(resultbyte1);  //마찬가지이다.
		
		int int1 = 1234;
		long lg1 = 1234;
		int result_int = int1+(int)lg1;
		System.out.println(result_int); 
	}

}
