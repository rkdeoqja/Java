package chapter4_Operation;

public class OperationEx07 {

	public static void main(String[] args) {
		//for �ݺ���
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
		//for �ݺ����� ��ȣ�� �ʱ�� ���ǽ� �������̶�� �ι����� ���������� �ش������� �������� �ݺ��ϸ鼭 ���๮�� �����Ѵ�
		
		int x=2;
		
		for(int i =0; i<=10;i+=x) {
			
			System.out.println(i);
		}
		//for���� ������ �κп� x����ŭ �����ϰ� �Ͽ� ����Ҽ��� �ִ�.
		//�ش� ���� Ǯ��ڸ� (int i=0 ���������� i�� ���� 0���� �ʱ�ȭ,i<=10 i�� 10���� �۰ų� ��������,i+=x i�� x�� ���Ѱ��� �����Ѹ�ŭ �����Ѵ�
		
		//������ for�ݺ����� �̿��Ͽ� 1���� 100���� �������� ���ϴ� ���α׷��� ����� ���Ҵ�
		int sum=0;
		for(int i=0;i<=100;i++) {
			sum += i;
			System.out.println(sum);
		}
		//for���� i������ ���������� for���� ��� �ٸ������� ����ϰų� �ҷ��ü�����
		//�ݸ� sum�� for�� �ۿ��� ����Ȱ��̶� for�� �ۿ����� ����Ҽ� �ִ°��� Ȯ���Ҽ� �ִ�.
		
		
		
	}

}
