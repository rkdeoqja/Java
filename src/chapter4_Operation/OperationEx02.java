package chapter4_Operation;

import java.util.Scanner;

public class OperationEx02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//java util package�� Scanner Ŭ����
		int a ;
		
		System.out.println("������ ������ �ϳ��� �Է��ϼ��� >>>");
		
		a = input.nextInt(); 
		
		System.out.println("a : "+a);
		
		if(a%2==1) {
			System.out.println("Ȧ���Դϴ�");
		}else if(a == 3) {
			System.out.println("a�� 3 �Դϴ�.");
		}else if(a%2 == 0) {
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("���ǿ� �´� ���� �ƴմϴ�.");
		}
	}

}
