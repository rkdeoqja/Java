package chapter4_Operation;

public class OperationEx08 {

	public static void main(String[] args) {
		//������ for���� �̿��� 3�� ����� ������� �ʴ� ���α׷��̴�
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		
		//�ݴ�� 3�� ����� ����Ҽ��� �ִ�.
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.println(i);
			}else {
				continue;
			}
		}
		//������ for���� �̿��� 3�� ��� �̸鼭 7�� ����� ����ϴ� ���α׷��̴�.
		int count=0;
		for(int i=1;i<=100;i++) { //1���� 100���� 1�� �����ϸ鼭
			if(i%3==0&&i%7==0) {// 3���� ���������� 7�� ������ ���°��� �������� if �� ������ ���µ� 
				System.out.println("3�� ����̸鼭 7�� ��� i: "+i);//i�� ���� ����ϰ�
				count++;	//3�� 7�� ����� ī��Ʈ�Ѵ�
			}else {
				continue;//�׿ܿ��� ��Ƽ���� �̿��Ͽ� �ٽ� �ݺ��Ѵ�
			}
		}
		System.out.println("1���� 100���� 3�ǹ���̸鼭 7�� ����� "+count+"�� �Դϴ�.");
		//��� ��� 21,42,63,84 count: 4
	}

}
