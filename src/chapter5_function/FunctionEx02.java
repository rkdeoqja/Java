package chapter5_function;

import java.util.Scanner;

public class FunctionEx02 {
	//�Լ��� ��ȯŸ�Կ� ���ؼ� ����
	
	public static void message(String fruit) {
		System.out.println(fruit+"�� ���ִ�.");
	}//��ȯŸ���� void�̱� ������ �ش� �Լ��� ��û������ ��ȯ�Ǵ� ���� ���� �׷��� ��°��� ���� �Է����ִ� ������ ����ߴ�.
	
	public static String msg(String fruit) {
		String message ="��ȯ�� "+ fruit+"�� ���ִ� ";
		return message;
	}//�ݸ� ��ȯŸ���� String���� �Ǿ��־ message�� ��ȯ�ߴ�

	public static void main(String[] args) {

		String fruit = "�ٳ���";
		
		message(fruit); //�ش� �޼ҵ带 ȣ�������� �޼ҵ���� ��¹��� ��µȴ�.
		System.out.println(msg(fruit)); 
		//��ȯŸ���� �ִ� �޼ҵ带 ȣ�������ÿ� �ش� ���� ��¹����� �Ѿ���°��� �ƴϱ� ������ ��¹����� �޼ҵ带 ���μ� ����Ͽ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �̸��� �Է��ϼ���");
		fruit = sc.nextLine(); //ScannerŬ������ nextLine�޼ҵ带 �̿��Ͽ� fruit������ ���� �޾� �޼ҵ忡 �����Ѵ�
		message(fruit); 
		System.out.println(msg(fruit));
		
		
	}

}
