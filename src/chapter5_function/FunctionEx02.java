package chapter5_function;

import java.util.Scanner;

public class FunctionEx02 {
	//함수의 반환타입에 대해서 설명
	
	public static void message(String fruit) {
		System.out.println(fruit+"는 맛있다.");
	}//반환타입이 void이기 때문에 해당 함수를 요청했을시 반환되는 값이 없다 그래서 출력값을 직접 입력해주는 식으로 사용했다.
	
	public static String msg(String fruit) {
		String message ="반환된 "+ fruit+"는 맛있다 ";
		return message;
	}//반면 반환타입이 String으로 되어있어서 message를 반환했다

	public static void main(String[] args) {

		String fruit = "바나나";
		
		message(fruit); //해당 메소드를 호출했을시 메소드안의 출력문이 출력된다.
		System.out.println(msg(fruit)); 
		//반환타입이 있는 메소드를 호출했을시엔 해당 값이 출력문으로 넘어오는것이 아니기 때문에 출력문으로 메소드를 감싸서 출력하였다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과일 이름을 입력하세요");
		fruit = sc.nextLine(); //Scanner클래스의 nextLine메소드를 이용하여 fruit변수의 값을 받아 메소드에 전달한다
		message(fruit); 
		System.out.println(msg(fruit));
		
		
	}

}
