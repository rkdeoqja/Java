package chapter4_Operation;

import java.util.Scanner;

public class OperationEx09 {

	public static void main(String[] args) {
		//반복문과 Scanner클래스를 이용해 구구단을 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int a=0;
		int gu=0;
		System.out.println("단에 해당하는 숫자를 입력해 주세요>>");
		a= sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			gu = a*i;
			System.out.printf("%d x %d = %d \n",a,i,gu);
		}
		
		
		
		
	}

}
