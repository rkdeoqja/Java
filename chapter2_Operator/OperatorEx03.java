package chapter2_operator;

public class OperatorEx03 {

	public static void main(String[] args) {
		//���迬������ ������<,>,<=,>=,==,!=�� �ְ� 
		// A < B : A �� B ���� �۴� 
		// A > B : A �� B ���� ũ��
		// A <= B : A��  B���� �۰ų� ����
		// A >= B : A�� B���� ũ�ų� ����
		// A == B : A�� B �� ����
		// A != B : A�� B �� ���� �ʴ�
		
		int a = 10 ;
		int b = 20 ;
		boolean result;
		
		result = a<b;
		System.out.println("a < b : "+result); 
		result = a>b;
		System.out.println("a > b : "+result);	
		result = a<=b;
		System.out.println("a <= b : "+result); 
		result = a>=b;
		System.out.println("a >= b : "+result);
		result = a==b;
		System.out.println("a == b : "+result);
		result = a!=b;
		System.out.println("a != b : "+result);
		
	}

}
