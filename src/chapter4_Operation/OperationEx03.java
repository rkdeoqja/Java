package chapter4_Operation;

import java.util.Scanner;

public class OperationEx03 {

	public static void main(String[] args) {
		//switch case��
		
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("1���� 5���� ������ �ϳ��� �Է��ϼ��� >>>");
		a = sc.nextInt();
		//������ ����ġ ���̽� ������ 1~5�� ���ڸ� ���ߴ� ���α׷��̴�.
		switch(a) { //����ġ�� ���� ���� ���̽��ȿ� ���ǰ� ���ؼ� ������ �´ٸ�  �����Ѵ�
		case 1 :
			System.out.println("1�� �Է��Ͽ����ϴ�");
			break;
		case 2 :
			System.out.println("2�� �Է��Ͽ����ϴ�");
			break;
		case 3 :
			System.out.println("3�� �Է��Ͽ����ϴ�");
			break;
		case 4 :
			System.out.println("4�� �Է��Ͽ����ϴ�.");
			break;
		case 5 :
			System.out.println("5�� �Է��Ͽ����ϴ�");
			break;
		default : //���� case�� ���� ���ٸ� default���� �ɷ� 
			System.out.println("1 ~ 5�����߿� �Է��ϼ���");
		}
		
		
	}

}
