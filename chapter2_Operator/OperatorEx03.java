package chapter2_operator;

public class OperatorEx03 {

	public static void main(String[] args) {
		//관계연산자의 종류는<,>,<=,>=,==,!=이 있고 
		// A < B : A 가 B 보다 작다 
		// A > B : A 가 B 보다 크다
		// A <= B : A는  B보다 작거나 같다
		// A >= B : A는 B보다 크거나 같다
		// A == B : A는 B 와 같다
		// A != B : A는 B 와 같지 않다
		
		int a = 10 ;
		int b = 20 ;
		boolean result;
		
		result = a<b;
		System.out.println("a < b : "+result); 
		result = a>b;
		System.out.println("a > b : "+result);	
		result = a<=b;
		System.out.println("a <= b : "+result); 
		result = a>=b;
		System.out.println("a >= b : "+result);
		result = a==b;
		System.out.println("a == b : "+result);
		result = a!=b;
		System.out.println("a != b : "+result);
		
	}

}
