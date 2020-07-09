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
