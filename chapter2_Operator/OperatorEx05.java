package chapter2_operator;

public class OperatorEx05 {

	public static void main(String[] args) {
		
		// 증감연산자에 대해 알아보자
		//ch1 variableEx02에서 사용한적이 있다
		// 
		int i1 = 5;
		int i2 = 5;
		
		System.out.println("증가연산자 선행: "+ ++i1);
		System.out.println("다음줄의 i1 : "+ i1);
		//증가연산자가 선행일땐 증가연산자가 사용되는 변수에서 부터 값이 증가하는것을 볼수있다
		System.out.println("증가연산자 후행: "+ i2++);
		System.out.println("다음줄의 i2 : "+ i2);
		//증가연산자가 후행일땐 증가연산자가 사용된후 다음연산이나 다음문장에서 부터 값이 증가하는것을 확인할수있다.
		int j1 = 10;
		int j2 = 10;
		
		System.out.println("감소연산자 선행: "+ --j1);
		System.out.println("다음줄의 j1 : "+ j1);
		//감소연산자도 마찬가지로 선행일시에는 감소연산자가 사용된 그줄에서 부터 값이 감소하는것을 확인할수있고
		System.out.println("감소연산자 후행: "+ j2--);
		System.out.println("다음줄의 j2 : "+ j2);
		//후행일시에는 다음연산이나 다음문장부터 값이 감소하는것을 볼수있다
		
		int n1 = 7;
		int result1 = 0;
		
		result1 = ++n1;
		System.out.println(result1);
		System.out.println("n1 : "+n1);
		//증가 연산자의 선행의 경우에는  32번째 라인의 이미 8값이 들어가게 되어 33번째 라인에서 이미 8이 된것을 확인할수 있다
		
		int n2 = 7;
		int result2 = 0;
		
		result2 = n2++;
		System.out.println(result2);
		System.out.println("n2 : "+ n2);
		//후행의 경우 40번째 라인에서 7이 들어간것을 확인할수있고 41번째라인에서  result2에 들어간 7을 출력한뒤 42번째 라인의 값은 8로 증가한것을 확인할수있다
		
		//증감연산자 후행에서는 해당 연산 수행문에서는 1증가나 1감소되는것이 적용되지 않고
		//다음 연산이나 , 다음문장에서 부터 적용이 되게 됩니다.(주의)
		
	}

}
