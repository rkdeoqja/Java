package chapter3_Console;

public class ConsoleEx01 {

	public static void main(String[] args) {
		
		System.out.print("������ 7,�Ǽ��� 3.14f,"); //print�� ��¹��� ��µǰ� ���� �ڵ��ٹٲ��� �ȵǰ� ���ٷθ� ��µȴ�.
		System.out.println("���ڴ�J, ���ڿ��� Love"); //println�� ��¹��� ��µǰ� ����  �ڵ��ٹٲ��� �ȴ�
		
		System.out.printf("������ %d, �Ǽ���%f, ���ڿ�%c, ���ڿ���%s,",7,3.1f,'J',"Love");
		//printf�� �ڵ��ٹٲ��� �Ͼ�� ������ ������ �մ� ���
		//������ decimal��  %d �Ǽ��� float�� %f ���ڴ� char�� %c ���ڿ��� String�� %s
		System.out.println();
		String str = "JAVA";
		
		System.out.printf("������ %d, �Ǽ���%f, ���ڴ�%c,���ڿ���%s",7,3.1f,'J',str);
	}	//printf("����ȭ�� ���ڿ�","����ȭ�� ���ڿ��� ������ ��");

}
