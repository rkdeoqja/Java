package chapter4_Operation;

public class OperationEx04 {

	public static void main(String[] args) {
			
		//while �ݺ���
		int i = 10; //�ʱ��
		
		while(i>=0) {//���ǽ�
			System.out.print(i--+" "); //������
		}
		System.out.println("���న�� �� i: "+i);
		
		int j = 10;
		
		while(j>=0) { //���ǽĿ� ���� ������ true�Ͻ� while���� �ݺ��ϰԵȴ�.
			System.out.print(--j+" ");
		}
		System.out.println("���న�� �� j: "+j);
		
		//������ while���� �̿��Ͽ� 1���� 100���� �� ���� ���غ� ���α׷��̴�.
		
		int num = 1;
		int sum =0;
		
		while(num<=100) {
			sum +=num;
			num++;
		}
		
		System.out.println("num: "+num+", sum: "+sum);
		//��� num:101, sum: 5050
		//num�� ���������̹Ƿ� �ش�ݺ����� ����ȵڿ� ���� 101�� �����Ͽ���
		//1���� 100������ ���� 5050�� �ȴ�.
		
		
	}

}
