package chapter1_Variable;

public class VariableEx02 {

	public static void main(String[] args) {
		
		byte num1 = 127;
		byte num2 = -128;
		
		//�⺻�ڷ��� ����Ÿ�� byte�� ������ �ִ� ������ -128~127�� �������ִ�
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		num1++; //++�� ������������ �������� �տ� ���̸� ���� ���� �ڿ� ���̸� ���� ����
		num2--; //--���� ������������ �������� �տ� ���̸� ���� ���� �ڿ� ���̸� ���� ����
		
		System.out.println("1 �����ѵڿ� num1: "+num1);
		System.out.println("1 �����ѵڿ� num2: "+num2);
		//result : num1�� ��� byte�� �������ִ� ������ �Ѿ �����÷ο� �߻� -128�� ���   
		//         num2 ���� byte�� ���� �� �ִ� ������ �Ѿ ����÷ο� �߻� 127�� ���
		
		num1--;
		num2++;
		
		System.out.println("1 �����ѵڿ� num1: "+num1);
		System.out.println("1 �����ѵڿ� num2: "+num2);
		//result : num1�� �Ǵٽ� -128������ ������ �Ѿ  ����÷ο� �߻� 127�� ��� 
		//		 : num2 ���� 127�� ������ �Ѿ �����÷ο� �߻� -128�� ���
		
	}

}
