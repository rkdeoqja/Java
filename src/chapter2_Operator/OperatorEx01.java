package chapter2_Operator;

public class OperatorEx01 {
	
	public static void main(String[] args) {
		
		//�������� ������ ��������� ���� ���� ���� ������ ������ �� ���� ������� �����Ҽ��ִ�.
		int n1;
		n1 = 7;
		
		int n2 = 3;
		
		int result = n1 + n2;
		System.out.println("������� : "+result);
		
		result = n1 -n2;
		System.out.println("������� : "+result);
		
		result = n1 *n2;
		System.out.println("������� : " +result );
		
		result = n1 / n2;
		System.out.println("��������� : "+result);
		
		result = n1 % n2;
		System.out.println("������ ��� : "+result);
		
		//��ó�� ������ ������� �ٷ� �����Ҽ��������� �Ʒ�ó�� ��¹����� �ٷ� ��� �ϴ°͵� �����ϴ�
		
		System.out.println("������� : "+(n1+n2));
		System.out.println("������ ������: "+7%3);
		System.out.println("�Ǽ��� ������: "+7.2%3.0);
		
	}
}
