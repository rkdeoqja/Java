package chapter4_Operation;

import java.util.Scanner;

public class OperationEx10 {

	public static void main(String[] args) {
		//특정 숫자 범위에서 지정한 배수의 합계를 구하는 프로그램

		//제한사항
		//세개 숫자(시작숫자, 끝숫자,합계를 구할배수)

		//예상 출력결과
		//범위의 시작 숫자 입력> 1
		//범위의 끝 숫자 입력> 50
		//합계를 구할 배수 입력>7
		//1~50범위에서 7배수의 합계:??
		
		int s; //범위의 시작을 입력할 변수
		int e;	//범위의 끝을 입력할 변수
		int ms;	//합계를 구할 배수를 입력할 변수
		int sum=0; //배수를 합계를 저장할 변수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("범위의 숫자 입력>>");
		s = sc.nextInt();
		System.out.println("범위의 끝 숫자 입력>>");
		e = sc.nextInt();
		System.out.println("합계를 구할 배수 입력>>");
		ms = sc.nextInt();
		
		for(int i=s;i<=e;i++) {
			if(i%ms==0) {
				sum+=i;
				
			}
		}
		
		System.out.printf("%d~%d범위에서 %d배수의 합계: %d",s,e,ms,sum);
		
		
		
		
	}

}
