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
		//������ ����for���� �̿��� ������ ��ü�� ����ϴ� ���α׷��̴�.
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.printf("%d x %d = %d \n",i,j,i*j);
			}
		}
		
		//������ break label���� ǥ���Ѱ��̴�.
		// ���̺��: �ڿ� for���� �;��ϰ� break ���̺��;���� ����Ҽ� �ִ�.
		exit_break:
			for(int i=2; i<10;i++) {
				for(int j=1;i<10;j++) {
					System.out.printf("%d x %d = %d \n",i,j,i*j);
					if(j==3) {
						break exit_break;
					}
				}
			}
		//break label���� �ѹ��� �ܺιݺ������� �������ö� ��� �մϴ�.
		
	}

}
