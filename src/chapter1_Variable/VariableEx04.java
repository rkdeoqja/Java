package chapter1_Variable;

public class VariableEx04 {

	public static void main(String[] args) {
		
		int num1 = 0xA0F; 	//16���� ǥ���
		int num2 = 0752;	//8���� ǥ���
		int num3 = 752;		//10���� ǥ���
		
		System.out.println(num1); //����� 10������ ���
		System.out.println(num2); //����� 10������ ���
		System.out.println(num3); //����� 10������ ���
		//���� ǥ��� *���� ū���ڳ� ���� ���� ���ڸ� ǥ���Ҷ��� ����ǥ����� ���
		double e1 = 1.7e+3; 
		double e2 = 1.7e-3; 
		
		System.out.println("�Ǽ�e+����: "+e1);//�Ǽ�e+����: �Ǽ� *10�� �ŵ������̸� 1.7e+3�̶�� 1.7 * 1000 = 1700.0���� ���
		System.out.println("�Ǽ�e-����: "+e2);//�Ǽ�e-����: �Ǽ� *(1/10�� �ŵ�����)�̸� 1.7e-3�̶�� 1.7*(1/1000) = 0.0017���� ���
		
	
	}

}
