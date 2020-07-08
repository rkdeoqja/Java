package chapter2_Operator;

public class OperatorEx06 {

	public static void main(String[] args) {
		//논리 연산자 
		// and 연산자 &&와 or 연산자 ||와 not 연산자인 !가 있다.
		//&&연산자의 경우 둘다 true일 경우에만 true를 반환하며 둘중 하나라도 false라면 false가 된다.
		//||연산자는 둘중 하나라도 true일 경우에 true를 반환한다 나머지가 false라도 하나의 true만 있다면 true를 반환한다
		//!연산자는 반대되는 값을 반환한다 true일경우 false를 , false일경우 true를 반환한다
		boolean t,f,t2,result;
		t= true;
		f= false;
		t2= true;
		
		result = t && f;
		System.out.println("t && f : "+result);
		
		result = t || f;
		System.out.println("t || f : "+ result);
		
		result = !t;
		System.out.println("!t : "+result);
		
		result = t && t2;
		System.out.println("t && t2 : "+result);
		
		int a,b;
		a = b = 10;
					//false  		//false
		result = (a++ >= ++b) && (++a <= b++);
		//		  10  >=  11  &&  12  <=  11 
		// a는 10에서 후행증가하기때문에 현재값은 10이고 b는 선행증가로 11이 되어있는상황 따라서 10은 11보다 크거나 같지 않기 때문에 false
		// 논리연산자 오른편에 있는 a는 11이 되어 넘어왔으나 선행증가로 12가 되었고 b는 11이 되어 넘어온뒤 후행증가이기때문에 현재값은 11이다
		// 그러므로 12는 11보다 작거나 같지 않으므로 false를 반환하며 
		// AND 논리연산자이기 때문에 둘중 하나만 false라도 false를 반환한다 따라서 false가 결과값이다.
		
		System.out.println("(a++ >= ++b) && (++a <= ++b) result: "+result);
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		
		// 논리연산자와 SCE (Short Circuit Evolution) 
		// java javascript python은 sce를 지원하는데 sce는 최단거리 연산기능이며 
		// AND연산자에서 첫번째 조건이 false인경우에 후에 뭐가오든 false이니  뒤에 따라오는 값의 계산을 하지않고 false를 반환한다.
		// OR연산자는 첫번째 조건이 true일경우 뒤에 뭐가오든 true를 반환하니 뒤에오는 계산을 하지않고 true를 반환한다.
	
	
	}

}
