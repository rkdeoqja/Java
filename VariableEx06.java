package chapter1_variable;

public class VariableEx06 {

	public static void main(String[] args) {
		
		char ch1= 'A'; 		//0x41
		char ch2 = '��'; 	//0xD55C
		char ch3 = 54620; 	//0xD55C
		char ch4 = 0x3081; 	
		char ch5 = 0x3082;	
		char ch6 = '1';		
		char ch7 = 1;	
		
		//�Ʒ� ��� ����� ���� �⺻�ڷ��� char�� ���ڸ� ������ �ٷ� ���ڷ� ǥ������� ���ڳ� 16������ ������ 
		//�׿� �ش��ϴ� �ƽ�Ű�ڵ�ǥ�� ���ڸ� �����Ѵ�
		
		System.out.println(ch1);	//A
		System.out.println(ch2);	//��
		System.out.println(ch3);	//��
		System.out.println(ch4);	//��
		System.out.println(ch5);	//��
		System.out.println(ch6); 	//1
		System.out.println(ch7);	//
		
	}

}
