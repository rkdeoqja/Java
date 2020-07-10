package chapter4_Operation;

import java.util.Scanner;

public class OperationEx05 {

	public static void main(String[] args) {
		
		//다음은 Scanner클래스를 이용해 입력받은값을 
		//while문으로 누적합을 구하는 프로그램 
		//0을 입력하면 종료할수있는 프로그램
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		int i=1;	//입력받을 변수생성 변수의 기본값은 0이 아닌것으로 설정
		int sum =0; //입력받은 값을 합할 변수 생성
		System.out.println("정수를 입력 해주세요>>");
		while(i>0) {				//조건식으론 0보다 큰값이 들어왔을때 무한루프 
			i= sc.nextInt();		//콘솔창에 입력받은 값을 변수에 저장
			System.out.print("입력받은수는 : "+i);
			sum += i;				//i를 sum에 합해서 저장한다
			System.out.print(",현재 합 : "+sum);
			if(i!=0) System.out.println(", 정수를 입력해주세요>"); //i가 0이 아닐때 나올 출력문
			else System.out.println(", 시스템을 종료합니다");	//사용자가 0을 입력했을때 나올 출력문
		}
		
	}

}
