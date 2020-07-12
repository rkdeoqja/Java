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
		//다음은 다중for문을 이용한 구구단 전체를 출력하는 프로그램이다.
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.printf("%d x %d = %d \n",i,j,i*j);
			}
		}
		
		//다음은 break label문을 표현한것이다.
		// 레이블명: 뒤엔 for문이 와야하고 break 레이블명;으로 사용할수 있다.
		exit_break:
			for(int i=2; i<10;i++) {
				for(int j=1;i<10;j++) {
					System.out.printf("%d x %d = %d \n",i,j,i*j);
					if(j==3) {
						break exit_break;
					}
				}
			}
		//break label문은 한번에 외부반복문까지 빠져나올때 사용 합니다.
		
	}

}
