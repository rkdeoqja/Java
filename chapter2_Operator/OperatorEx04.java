package chapter2_operator;

public class OperatorEx04 {

	public static void main(String[] args) {
		
		// ���迬���ڴ� ���ǽĿ��� ���� ���ȴ�
		int a = 10;
		float b = 10.0f;
		
		if(a == b) { //a �� b�� �����Ƿ� if�� ���� ��¹��� ����Ѵ� ���� �ٸ��ٸ� else�� �ȿ� �ִ� ��¹��� ����ϰ� �ȴ�
			System.out.println("a�� b�� ���� .");
			System.out.println("a : "+ a);
			System.out.println("b : "+ b);
		}else {
			System.out.println("a�� b�� ���� �ʴ�.");
		}
		
		char c = '0';
		int d = 0;
		//���ڴ� �ƽ�Ŷ�ڵ尪���� ��ȯ�Ǿ� ó���ȴ� '0'�� �ƽ�Ŷ�ڵ�:48 �� ���� 0 �� �����ʴ�.
		if(c != d) { // c�� d�� ���ڷμ� '0'�� ����0�� ���̴� ���� �����Ƿ� if�� ��¹��� ����Ѵ�
			System.out.println("c�� d�� ���� �ʴ�.");
			System.out.println("c: "+c);
			System.out.println("c�� �ƽ�Ŷ �ڵ尪: "+(int)c); // char�� int���� �ƽ�Ŷ�ڵ尪�� ���� �ʹٸ� ����� ����ȯ�� ���ؼ� �����ϴ�
			System.out.println("d: "+d);
		}else {
			System.out.println("c�� d�� ����.");
		}
		
		
	}

}
