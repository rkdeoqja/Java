package chapter2_operator;

public class OperatorEx04 {

	public static void main(String[] args) {
		
		// 관계연산자는 조건식에서 많이 사용된다
		int a = 10;
		float b = 10.0f;
		
		if(a == b) { //a 와 b는 같으므로 if문 안의 출력문을 출력한다 만약 다르다면 else문 안에 있는 출력문을 출력하게 된다
			System.out.println("a는 b와 같다 .");
			System.out.println("a : "+ a);
			System.out.println("b : "+ b);
		}else {
			System.out.println("a는 b와 같지 않다.");
		}
		
		char c = '0';
		int d = 0;
		//문자는 아스킷코드값으로 변환되어 처리된다 '0'의 아스킷코드:48 는 숫자 0 과 같지않다.
		if(c != d) { // c와 d는 문자로서 '0'과 숫자0의 비교이니 같지 않으므로 if의 출력문을 출력한다
			System.out.println("c와 d는 같지 않다.");
			System.out.println("c: "+c);
			System.out.println("c의 아스킷 코드값: "+(int)c); // char의 int값인 아스킷코드값을 보고 싶다면 명시적 형변환을 통해서 가능하다
			System.out.println("d: "+d);
		}else {
			System.out.println("c와 d는 같다.");
		}
		
		
	}

}
