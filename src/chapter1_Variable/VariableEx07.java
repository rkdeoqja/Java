package chapter1_Variable;

public class VariableEx07 {

	public static void main(String[] args) {
		
		//논리 자료형 boolean 참과 거짓중 한가지 값만 가질수있다.
		boolean b1 = true;     
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(3 < 10); //3은 10보다 작으니 참을 나타내고 있으므로 true를 출력
		System.out.println(3 > 10); //3은 10보다 크지 않으니 거짓을 나타내고있으므로 false를 출력
		
		boolean b4 = 10 > 3; //10은 3보다 크니 true값으로 초기화 됨
		System.out.println("b4: "+b4); //b4는 참 true
		
	}

}
