package chapter1_Variable;

public class VariableEx08 {

	public static void main(String[] args) {
		
		 
		byte b1 = 127;
		byte b2 = 127;
		// byte b3 = b1 + b2; byte�� ������ ����� ������ �߻��Ѵ�

		//���θ��
		int i1 = b1+b2; //byte���� ū �ڷ����̱� ������ �ڷῡ �ս��� �߻����������� �ڵ����� ����ȯ�� �̷������
		System.out.println(i1);
		System.out.println(b1+b2);
		System.out.println();
		
		short s1 = 12345; 
		short s2 = 12345;
		int i2 = s1+s2; //short���� ū�ڷ����̱� ������ �ڵ�����ȯ ���θ���� �̷������
		System.out.println(i2);
		System.out.println();
		
		int int2 =12345;
		double d1 = 100.5;
		double resultd = int2+d1; //int���� double�� �ڷ����� ũ�� ������ int2�� 12345���� 12345.0���� ����ȯ�� �̷������ ���ȴ�.
		
	}

}
