package chapter4_Operation;

import java.util.Scanner;

public class OperationEx03 {

	public static void main(String[] args) {
		//switch case문
		
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("1부터 5까지 숫자중 하나를 입력하세요 >>>");
		a = sc.nextInt();
		//다음은 스위치 케이스 문으로 1~5의 숫자를 맞추는 프로그램이다.
		switch(a) { //스위치에 오는 값을 케이스안에 조건과 비교해서 조건이 맞다면  실행한다
		case 1 :
			System.out.println("1을 입력하였습니다");
			break;
		case 2 :
			System.out.println("2를 입력하였습니다");
			break;
		case 3 :
			System.out.println("3을 입력하였습니다");
			break;
		case 4 :
			System.out.println("4를 입력하였습니다.");
			break;
		case 5 :
			System.out.println("5를 입력하였습니다");
			break;
		default : //만약 case의 값에 없다면 default문에 걸려 
			System.out.println("1 ~ 5숫자중에 입력하세요");
		}
		
		
	}

}
