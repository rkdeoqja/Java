package chapter3_Console;

import java.util.Scanner;

public class ConsoleEx04 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���");
		String line = scanner.nextLine();
		System.out.println("�Է¹��� ���ڴ� \""+line+"\" �Դϴ�");
		
		System.out.println("������ �Է��ϼ���");
		int num = scanner.nextInt();
		System.out.println("�Է¹��� ������ "+num+" �Դϴ�");
		
		System.out.println("�Ǽ��� �Է��ϼ���");
		double d = scanner.nextDouble();
		System.out.println("�Է¹��� �Ǽ���  "+d+" �Դϴ�");
		
		//���� ���� ���ڴ� nextLine() ������ nextInt() �Ǽ��� nextDouble() �޼ҵ带 �̿��ϸ� �Է¹������ִ�.
	}

}
