package chapter4_Operation;

import java.util.Scanner;

public class OperationEx09 {

	public static void main(String[] args) {
		//�ݺ����� ScannerŬ������ �̿��� �������� ����ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		
		int a=0;
		int gu=0;
		System.out.println("�ܿ� �ش��ϴ� ���ڸ� �Է��� �ּ���>>");
		a= sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			gu = a*i;
			System.out.printf("%d x %d = %d \n",a,i,gu);
		}
		
		
		
		
	}

}
