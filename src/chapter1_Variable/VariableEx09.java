package chapter1_Variable;

public class VariableEx09 {

	public static void main(String[] args) {
		//���� 
		
		byte b1 = 125;
		byte b2 = 125;
		byte result_byte = (byte)(b1+b2); 
		
		//byte�� ������ �Ѿ ���� byte�� ����� ����ȯ�� ���� ���� ���������� �ڷ��� �ս��� �̷�������ִ�
		
		System.out.println(result_byte); //�������� ���� �ڷ����� �� ��� ���� -6�� �Ǿ���
		System.out.println(b1+b2);		//������ ���� 250�ΰ� �˼��ִ�
		System.out.println();
		
		short s1 = 1234; 
		short s2 = 1234;
		short result_short = (short)(s1+s2); // ���� �ڷ����� byte short�� int�� ���θ�� �Ǿ��� ���Ǳ� ������ 
		byte b3 = 1;						 // int ���� ���� �ڷ����� byte�� short�� �ڷḦ �ְ����������
		byte b4 = 1;						 // �����ȿ� �ִ��� ū�ڷ������� ���� �ڷ������� ���ǵǴ°��̱� ������ ���������ȯ�� ��������Ѵ�
		byte resultbyte1 =(byte)(b3+b4);
		System.out.println(result_short); //�����ȿ� ���� ���� �־ �սǵ� ���� ����
		System.out.println(s1+s2);		
		System.out.println(resultbyte1);  //���������̴�.
		
		int int1 = 1234;
		long lg1 = 1234;
		int result_int = int1+(int)lg1;
		System.out.println(result_int); 
	}

}
