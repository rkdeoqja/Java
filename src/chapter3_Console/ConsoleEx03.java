package chapter3_Console;

import java.util.Scanner;

public class ConsoleEx03 {

	public static void main(String[] args) {
		
	//java.util.Scanner scanner = new java.util.Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		//java�� util package�� �ִ� ScannerŬ����
		int num1 = scanner.nextInt();   //nextInt()��� �޼ҵ带 ���� �������� �޾ƿü� �ִ�
		int num2 = scanner.nextInt();	
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		
		System.out.printf("���ڿ��� ����� %d,%d,%d,%d,%d",num1,num2,num3,num4,num5);
		
		int sum = num1+num2+num3+num4+num5;
		
		System.out.printf("\nŰ����� �Է¹��� ���� %d,%d,%d,%d,%d�̸� �� ���� %d�Դϴ�.",num1,num2,num3,num4,num5,sum);
		
	}

}
