package chapter4_Operation;

import java.util.Scanner;

public class OperationEx02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//java util package의 Scanner 클래스
		int a ;
		
		System.out.println("정수형 데이터 하나를 입력하세요 >>>");
		
		a = input.nextInt(); 
		
		System.out.println("a : "+a);
		//if else 문을 이용한 홀수 짝수를 구분하는 프로그램이다/
		//만약 a로 3을 받았다면
		// a == 3 과 같은 조건이 있음에도 불구하고 
		// 첫번째 if문에서 2로 나누었을때 1이 나오므로 첫번째 if문에서 실행되고 후조건은 실행되지 않는다.
		if(a%2==1) {
			System.out.println("홀수입니다");
		}else if(a == 3) {
			System.out.println("a는 3 입니다.");
		}else if(a%2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("조건에 맞는 값이 아닙니다.");
		}
	}

}
