package chapter4_Operation;

public class OperationEx06 {

	public static void main(String[] args) {
		//do ~ while �ݺ���
		
		int num=10;
		
		do { // do while���� �ش������� �����ʴ��� �ѹ��� ����ȴ�
			System.out.println("num�� 7���� ���� ������ ����Ǵ°��� �����ֽ��ϴ�.num: "+num);
			num++;
		}while(num < 7);
		
		System.out.println("do while���� ����� �� num�� ��: "+num);
		
		//do while ���� �̿��� 1���� 100������ �ձ��ϱ�
		int n =0;
		int sum=0;
		do {
			n++;
			sum+=n;
			System.out.print("sum: "+sum+", ");
		}while(n<100);
			System.out.println("n: "+n);
		
		
		
	}

}
