package chapter4_Operation;

import java.util.Scanner;

public class OperationEx10 {

	public static void main(String[] args) {
		//Ư�� ���� �������� ������ ����� �հ踦 ���ϴ� ���α׷�

		//���ѻ���
		//���� ����(���ۼ���, ������,�հ踦 ���ҹ��)

		//���� ��°��
		//������ ���� ���� �Է�> 1
		//������ �� ���� �Է�> 50
		//�հ踦 ���� ��� �Է�>7
		//1~50�������� 7����� �հ�:??
		
		int s; //������ ������ �Է��� ����
		int e;	//������ ���� �Է��� ����
		int ms;	//�հ踦 ���� ����� �Է��� ����
		int sum=0; //����� �հ踦 ������ ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� �Է�>>");
		s = sc.nextInt();
		System.out.println("������ �� ���� �Է�>>");
		e = sc.nextInt();
		System.out.println("�հ踦 ���� ��� �Է�>>");
		ms = sc.nextInt();
		
		for(int i=s;i<=e;i++) {
			if(i%ms==0) {
				sum+=i;
				
			}
		}
		
		System.out.printf("%d~%d�������� %d����� �հ�: %d",s,e,ms,sum);
		
		
		
		
	}

}
