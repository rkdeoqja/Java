package chapter1_Variable;

public class VariableEx03 {

	public static void main(String[] args) {
		
		// double�� �Ǽ��� ����Ÿ���̴�
		// �Ǽ��� ����Ÿ���� float���� double���� �ְ� �Ҽ��� ���ڸ��� �󸶳� �����ϰ� ǥ���Ҽ� �ִ����� ���̰� �ִ�
		// float 	4	3.4E+/-38(7���� �ڸ���)
		// double	8	1.7E+/-308(15���� �ڸ���)
		double num1;
		double num2;
		double result;
		
		num1 = 11.0000001;
		num2 = 22.0000002;
		
		result = num1+num2;
		
		System.out.println("num1�� ��: "+num1); //���� num1�� �� 11.0000001
		System.out.println("num2�� ��: "+num2); //���� num2�� �� 22.0000002
		System.out.println("result�� num1��num2�� ���Ѱ���� �ʱ�ȭ"+result); 
		//result�� ������ num1�� num2�� ���� 33.(�Ҽ���15�ڸ�)�� ������ ���� ���
	}

}
