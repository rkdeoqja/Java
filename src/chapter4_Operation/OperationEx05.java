package chapter4_Operation;

import java.util.Scanner;

public class OperationEx05 {

	public static void main(String[] args) {
		
		//������ ScannerŬ������ �̿��� �Է¹������� 
		//while������ �������� ���ϴ� ���α׷� 
		//0�� �Է��ϸ� �����Ҽ��ִ� ���α׷�
		
		Scanner sc = new Scanner(System.in); //Scanner ��ü ����
		int i=1;	//�Է¹��� �������� ������ �⺻���� 0�� �ƴѰ����� ����
		int sum =0; //�Է¹��� ���� ���� ���� ����
		System.out.println("������ �Է� ���ּ���>>");
		while(i>0) {				//���ǽ����� 0���� ū���� �������� ���ѷ��� 
			i= sc.nextInt();		//�ܼ�â�� �Է¹��� ���� ������ ����
			System.out.print("�Է¹������� : "+i);
			sum += i;				//i�� sum�� ���ؼ� �����Ѵ�
			System.out.print(",���� �� : "+sum);
			if(i!=0) System.out.println(", ������ �Է����ּ���>"); //i�� 0�� �ƴҶ� ���� ��¹�
			else System.out.println(", �ý����� �����մϴ�");	//����ڰ� 0�� �Է������� ���� ��¹�
		}
		
	}

}
