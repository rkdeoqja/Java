package chapter3_Console;

import java.util.Scanner;

public class ConsoleEx03 {

	public static void main(String[] args) {
		
	//java.util.Scanner scanner = new java.util.Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		//java의 util package에 있는 Scanner클래스
		int num1 = scanner.nextInt();   //nextInt()라는 메소드를 통해 정수값을 받아올수 있다
		int num2 = scanner.nextInt();	
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		
		System.out.printf("문자열에 저장된 %d,%d,%d,%d,%d",num1,num2,num3,num4,num5);
		
		int sum = num1+num2+num3+num4+num5;
		
		System.out.printf("\n키보드로 입력받은 값은 %d,%d,%d,%d,%d이며 그 합은 %d입니다.",num1,num2,num3,num4,num5,sum);
		
	}

}
