package chapter5_function;

public class FunctionEx01 {
	//������ �޼���� �ٸ� Ŭ������ �����س��� ����ϳ� �Ѵ��� ���� ���� ���������� �ۼ�
	// ����������       ��ȯŸ��    �޼ҵ�� (�Է� ����)
	public static void tellTime(int hour) {
		System.out.println("��ſ� �Ϸ��Դϴ�.");
		System.out.println("������ "+hour+"�� �Դϴ�.");
	}
	//���� �̸��� �̿��Ͽ� �Ű������� ������ �Է����¸� �ٸ��� �Ͽ� �����ε� �� �� �ִ�.
	public static void tellTime(int hour,int minute) {
		System.out.println("���� �� �ð��Դϴ�.");
		System.out.println("������ "+hour+"�� "+minute+"�� �Դϴ�.");
	}

	public static void main(String[] args) {
		
		tellTime(11);
		tellTime(12);
		tellTime(13);
		
		
		tellTime(16,35); 
		int hour=16;
		int minute= 35;
		tellTime(hour,minute); // ��ó�� ����Ҽ��� ������ �ش�Ÿ���� ������ ����� ���� ����Ҽ��� �ִ�.
		
		
		
		
	}

}
