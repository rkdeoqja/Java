package chapter2_operator;

public class OperatorEx08 {

	public static void main(String[] args) {
		//��� ������ ��ų ����Ʈ ����
		//����Ʈ ������ <<,>>��ȣ�� ���� �����̳� �������� ���ѵ� �ڿ����� ���ڸ�ŭ�� �̵��Ѵ� 
		
		
		byte n1 = 2 ;			  //128 64 32 16 8 4 2 1
		byte r1 = (byte)(n1 << 1); // 0  0  0  0 0 0 1 0 << �������� 1ĭ�̵�  ��°�: 4
		byte r2 = (byte)(n1 << 2); // 0  0  0  0 0 0 1 0 << �������� 2ĭ�̵�  ��°�: 8
		byte r3 = (byte)(n1 << 3); // 0  0  0  0 0 0 1 0 << �������� 3ĭ�̵�  ��°�: 16
		byte r4 = (byte)(n1 << 4); // 0  0  0  0 0 0 1 0 << �������� 4ĭ�̵�  ��°�: 32
		
		System.out.println("n1 << 1 : "+ r1); 
		System.out.println("n1 << 2: "+ r2);
		System.out.println("n1 << 3: "+ r3);
		System.out.println("n1 << 4: "+ r4);
		
		byte n2 = 10;			  //128 64 32 16 8 4 2 1
		byte r5 = (byte)(n2 >> 1); // 0  0  0  0 1 0 1 0 >> ���������� 1ĭ�̵�  ��°�: 5
		byte r6 = (byte)(n2 >> 2); // 0  0  0  0 1 0 1 0 >> ���������� 2ĭ�̵�  ��°�: 2
		byte r7 = (byte)(n2 >> 3); // 0  0  0  0 1 0 1 0 >> ���������� 3ĭ�̵�  ��°�: 1
		byte r8 = (byte)(n2 >> 4); // 0  0  0  0 1 0 1 0 >> ���������� 4ĭ�̵�  ��°�: 0
		
		System.out.println("n2 >> 1 : "+ r5); 
		System.out.println("n2 >> 2: "+ r6);
		System.out.println("n2 >> 3: "+ r7);
		System.out.println("n2 >> 4: "+ r8);
		
	}

}
